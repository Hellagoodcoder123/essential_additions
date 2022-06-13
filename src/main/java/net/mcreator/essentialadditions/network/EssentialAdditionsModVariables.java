package net.mcreator.essentialadditions.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.essentialadditions.EssentialAdditionsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialAdditionsModVariables {
	public static double deathCountSession = 0;
	public static double animalsKilledSession = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		EssentialAdditionsMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		EssentialAdditionsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.language = original.language;
			clone.commandKeyCommand = original.commandKeyCommand;
			clone.murderCountPersistent = original.murderCountPersistent;
			clone.murderCount1 = original.murderCount1;
			clone.timesCountedPersistent = original.timesCountedPersistent;
			clone.deathCountPersistent = original.deathCountPersistent;
			clone.animalsKilledPersistent = original.animalsKilledPersistent;
			if (!event.isWasDeath()) {
				clone.canFly = original.canFly;
				clone.murderCount = original.murderCount;
				clone.timesCraftedLifetime = original.timesCraftedLifetime;
				clone.animalsKilledLifetime = original.animalsKilledLifetime;
				clone.astroInOcean = original.astroInOcean;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					EssentialAdditionsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					EssentialAdditionsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					EssentialAdditionsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "essential_additions_worldvars";
		public double timesCraftedWorld = 0;
		public double deathCountWorld = 0;
		public double animalsKilledWorld = 0;
		public boolean animalGenocideAdvancementAchieved = false;
		public boolean animalGenocide2AdvancementAchieved = false;
		public boolean allAdminCanFly = false;
		public boolean animalGenocide3AdvancementAchieved = false;
		public boolean animalGenocide4AdvancementAchieved = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			timesCraftedWorld = nbt.getDouble("timesCraftedWorld");
			deathCountWorld = nbt.getDouble("deathCountWorld");
			animalsKilledWorld = nbt.getDouble("animalsKilledWorld");
			animalGenocideAdvancementAchieved = nbt.getBoolean("animalGenocideAdvancementAchieved");
			animalGenocide2AdvancementAchieved = nbt.getBoolean("animalGenocide2AdvancementAchieved");
			allAdminCanFly = nbt.getBoolean("allAdminCanFly");
			animalGenocide3AdvancementAchieved = nbt.getBoolean("animalGenocide3AdvancementAchieved");
			animalGenocide4AdvancementAchieved = nbt.getBoolean("animalGenocide4AdvancementAchieved");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("timesCraftedWorld", timesCraftedWorld);
			nbt.putDouble("deathCountWorld", deathCountWorld);
			nbt.putDouble("animalsKilledWorld", animalsKilledWorld);
			nbt.putBoolean("animalGenocideAdvancementAchieved", animalGenocideAdvancementAchieved);
			nbt.putBoolean("animalGenocide2AdvancementAchieved", animalGenocide2AdvancementAchieved);
			nbt.putBoolean("allAdminCanFly", allAdminCanFly);
			nbt.putBoolean("animalGenocide3AdvancementAchieved", animalGenocide3AdvancementAchieved);
			nbt.putBoolean("animalGenocide4AdvancementAchieved", animalGenocide4AdvancementAchieved);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				EssentialAdditionsMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "essential_additions_mapvars";

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				EssentialAdditionsMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("essential_additions", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String language = "\"en_us\"";
		public boolean canFly = false;
		public String commandKeyCommand = "\"gm s\"";
		public double murderCount = 0;
		public boolean murderCountPersistent = false;
		public double murderCount1 = 0;
		public double timesCountedPersistent = 0;
		public double timesCraftedLifetime = 0;
		public double deathCountPersistent = 0;
		public double animalsKilledLifetime = 0;
		public double animalsKilledPersistent = 0;
		public boolean astroInOcean = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				EssentialAdditionsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("language", language);
			nbt.putBoolean("canFly", canFly);
			nbt.putString("commandKeyCommand", commandKeyCommand);
			nbt.putDouble("murderCount", murderCount);
			nbt.putBoolean("murderCountPersistent", murderCountPersistent);
			nbt.putDouble("murderCount1", murderCount1);
			nbt.putDouble("timesCountedPersistent", timesCountedPersistent);
			nbt.putDouble("timesCraftedLifetime", timesCraftedLifetime);
			nbt.putDouble("deathCountPersistent", deathCountPersistent);
			nbt.putDouble("animalsKilledLifetime", animalsKilledLifetime);
			nbt.putDouble("animalsKilledPersistent", animalsKilledPersistent);
			nbt.putBoolean("astroInOcean", astroInOcean);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			language = nbt.getString("language");
			canFly = nbt.getBoolean("canFly");
			commandKeyCommand = nbt.getString("commandKeyCommand");
			murderCount = nbt.getDouble("murderCount");
			murderCountPersistent = nbt.getBoolean("murderCountPersistent");
			murderCount1 = nbt.getDouble("murderCount1");
			timesCountedPersistent = nbt.getDouble("timesCountedPersistent");
			timesCraftedLifetime = nbt.getDouble("timesCraftedLifetime");
			deathCountPersistent = nbt.getDouble("deathCountPersistent");
			animalsKilledLifetime = nbt.getDouble("animalsKilledLifetime");
			animalsKilledPersistent = nbt.getDouble("animalsKilledPersistent");
			astroInOcean = nbt.getBoolean("astroInOcean");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.language = message.data.language;
					variables.canFly = message.data.canFly;
					variables.commandKeyCommand = message.data.commandKeyCommand;
					variables.murderCount = message.data.murderCount;
					variables.murderCountPersistent = message.data.murderCountPersistent;
					variables.murderCount1 = message.data.murderCount1;
					variables.timesCountedPersistent = message.data.timesCountedPersistent;
					variables.timesCraftedLifetime = message.data.timesCraftedLifetime;
					variables.deathCountPersistent = message.data.deathCountPersistent;
					variables.animalsKilledLifetime = message.data.animalsKilledLifetime;
					variables.animalsKilledPersistent = message.data.animalsKilledPersistent;
					variables.astroInOcean = message.data.astroInOcean;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

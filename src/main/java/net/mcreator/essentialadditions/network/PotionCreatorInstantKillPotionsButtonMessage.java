
package net.mcreator.essentialadditions.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.essentialadditions.world.inventory.PotionCreatorInstantKillPotionsMenu;
import net.mcreator.essentialadditions.procedures.GiveSplashInstantKillPotionProcedure;
import net.mcreator.essentialadditions.procedures.GiveLingeringInstantKillPotionProcedure;
import net.mcreator.essentialadditions.procedures.GiveInstantKillPotionProcedure;
import net.mcreator.essentialadditions.procedures.GiveInstantKillArrowProcedure;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PotionCreatorInstantKillPotionsButtonMessage {
	private final int buttonID, x, y, z;

	public PotionCreatorInstantKillPotionsButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PotionCreatorInstantKillPotionsButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PotionCreatorInstantKillPotionsButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PotionCreatorInstantKillPotionsButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = PotionCreatorInstantKillPotionsMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GiveInstantKillPotionProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			GiveSplashInstantKillPotionProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			GiveLingeringInstantKillPotionProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GiveInstantKillArrowProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EssentialAdditionsMod.addNetworkMessage(PotionCreatorInstantKillPotionsButtonMessage.class,
				PotionCreatorInstantKillPotionsButtonMessage::buffer, PotionCreatorInstantKillPotionsButtonMessage::new,
				PotionCreatorInstantKillPotionsButtonMessage::handler);
	}
}

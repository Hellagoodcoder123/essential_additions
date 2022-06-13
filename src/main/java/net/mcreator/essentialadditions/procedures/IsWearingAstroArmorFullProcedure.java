package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IsWearingAstroArmorFullProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (IsWearingAstroFullProcedure.execute(entity)) {
			if (InOceanTypeBiomeProcedure.execute(world, x, y, z)
					&& (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new EssentialAdditionsModVariables.PlayerVariables())).astroInOcean == false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("essential_additions:astronaut_in_ocean")),
								SoundSource.MUSIC, 1, 1);
					} else {
						_level.playLocalSound(x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("essential_additions:astronaut_in_ocean")),
								SoundSource.MUSIC, 1, 1, false);
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.astroInOcean = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (InOceanTypeBiomeProcedure.execute(world, x, y, z) == false) {
				{
					boolean _setval = false;
					entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.astroInOcean = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (IsWearingAstroFullProcedure.execute(entity) == false) {
			{
				boolean _setval = false;
				entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.astroInOcean = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

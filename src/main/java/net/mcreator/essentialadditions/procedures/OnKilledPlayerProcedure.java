package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnKilledPlayerProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player == true && sourceentity instanceof Player == true) {
			if ((entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCountPersistent == true) {
				{
					double _setval = (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCount1 + 1;
					entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.murderCount1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCountPersistent == false) {
				{
					double _setval = (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCount + 1;
					entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.murderCount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnKilledAnimalProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Animal == true && sourceentity instanceof Player == true) {
			EssentialAdditionsModVariables.WorldVariables
					.get(world).animalsKilledWorld = EssentialAdditionsModVariables.WorldVariables.get(world).animalsKilledWorld + 1;
			EssentialAdditionsModVariables.WorldVariables.get(world).syncData(world);
			EssentialAdditionsModVariables.animalsKilledSession = EssentialAdditionsModVariables.animalsKilledSession + 1;
			{
				double _setval = (sourceentity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EssentialAdditionsModVariables.PlayerVariables())).animalsKilledLifetime + 1;
				sourceentity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.animalsKilledLifetime = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				double _setval = (sourceentity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EssentialAdditionsModVariables.PlayerVariables())).animalsKilledPersistent + 1;
				sourceentity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.animalsKilledPersistent = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}

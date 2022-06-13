package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnPlayerDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player == true) {
			EssentialAdditionsModVariables.WorldVariables
					.get(world).deathCountWorld = EssentialAdditionsModVariables.WorldVariables.get(world).deathCountWorld + 1;
			EssentialAdditionsModVariables.WorldVariables.get(world).syncData(world);
			EssentialAdditionsModVariables.deathCountSession = EssentialAdditionsModVariables.deathCountSession + 1;
			{
				double _setval = (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EssentialAdditionsModVariables.PlayerVariables())).deathCountPersistent + 1;
				entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.deathCountPersistent = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

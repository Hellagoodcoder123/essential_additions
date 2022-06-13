package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ItemsCraftedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EssentialAdditionsModVariables.WorldVariables
				.get(world).timesCraftedWorld = EssentialAdditionsModVariables.WorldVariables.get(world).timesCraftedWorld + 1;
		EssentialAdditionsModVariables.WorldVariables.get(world).syncData(world);
		{
			double _setval = (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new EssentialAdditionsModVariables.PlayerVariables())).timesCountedPersistent + 1;
			entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.timesCountedPersistent = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new EssentialAdditionsModVariables.PlayerVariables())).timesCraftedLifetime + 1;
			entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.timesCraftedLifetime = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

public class FlyCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new EssentialAdditionsModVariables.PlayerVariables())).canFly == true) {
			{
				boolean _setval = false;
				entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.canFly = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new EssentialAdditionsModVariables.PlayerVariables())).canFly == false) {
			{
				boolean _setval = true;
				entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.canFly = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

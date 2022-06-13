package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import java.util.HashMap;

public class SetCommandKeybindCommandCommandExecutedProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		{
			String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
			entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.commandKeyCommand = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

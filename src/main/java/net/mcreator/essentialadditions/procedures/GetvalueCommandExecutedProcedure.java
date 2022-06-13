package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.essentialadditions.network.EssentialAdditionsModVariables;

import java.util.HashMap;

public class GetvalueCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("language")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"The \\\"language\\\" variable for you currently has a value of: \\\"" + ""
								+ (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new EssentialAdditionsModVariables.PlayerVariables())).language
								+ "\\\"\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("canFly")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"The \\\"canFly\\\" variable for you currently has a value of: \\\"" + ""
								+ (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new EssentialAdditionsModVariables.PlayerVariables())).canFly
								+ "\\\"\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("commandKeyCommand")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"The \\\"commandKeyCommand\\\" variable for you currently has a value of: \\\"" + ""
								+ (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new EssentialAdditionsModVariables.PlayerVariables())).commandKeyCommand
								+ "\\\"\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("murderCount")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"The \\\"murderCount\\\" variable for you currently has a value of: \\\"" + ""
								+ (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCount
								+ "\\\"\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("murderCountPersistent")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"The \\\"murderCountPersistent\\\" variable for you currently has a value of: \\\"" + ""
								+ (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCountPersistent
								+ "\\\"\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("murderCount1")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"The \\\"murderCount1\\\" variable for you currently has a value of: \\\"" + ""
								+ (entity.getCapability(EssentialAdditionsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new EssentialAdditionsModVariables.PlayerVariables())).murderCount1
								+ "\\\"\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		}
	}
}

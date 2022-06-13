package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.HashMap;

public class LockCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("data merge " + (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " "
							+ (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "") + " "
							+ (cmdparams.containsKey("2") ? cmdparams.get("2").toString() : "") + " {Lock:"
							+ (cmdparams.containsKey("3") ? cmdparams.get("3").toString() : "") + "}"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					"tellraw @p {\"text\":\"Inventory Locked!\",\"color\":\"light_purple\",\"bold\":\"false\",\"italic\":\"false\"}");
	}
}

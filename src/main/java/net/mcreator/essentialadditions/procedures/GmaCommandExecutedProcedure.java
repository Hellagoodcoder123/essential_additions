package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.HashMap;

public class GmaCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if (!(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("gamemode adventure " + (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "")));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "gamemode adventure @p");
		}
	}
}

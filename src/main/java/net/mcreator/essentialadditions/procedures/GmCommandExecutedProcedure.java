package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.HashMap;

public class GmCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if (!(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (!(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
				if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("creative")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("c")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("gamemode creative " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
				} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("survival")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("s")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("gamemode survival " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
				} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("adventure")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("a")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("gamemode adventure " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
				} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spectator")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("sp")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spec")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("gamemode spectator " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
				}
			} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"tellraw @p {\"text\":\"You need to specify a gamemode to switch to\",\"color\":\"red\",\"italic\":\"false\",\"bold\":\"false\"}");
			}
		} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (!(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
				if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("creative")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("c")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "gamemode creative @p");
				} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("survival")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("s")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "gamemode survival @p");
				} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("adventure")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("a")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "gamemode adventure @p");
				} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spectator")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("sp")
						|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spec")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "gamemode spectator @p");
				}
			} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"tellraw @p {\"text\":\"You need to specify a gamemode to switch to\",\"color\":\"red\",\"italic\":\"false\",\"bold\":\"false\"}");
			}
		}
	}
}

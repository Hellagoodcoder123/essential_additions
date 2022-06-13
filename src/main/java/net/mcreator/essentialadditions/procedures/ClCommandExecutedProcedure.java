package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.essentialadditions.init.EssentialAdditionsModGameRules;

import java.util.HashMap;

public class ClCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("all")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("a")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("e")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("everything"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = item]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = armor_stand]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = tnt]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = tnt_minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = furnace_minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all lag generating entities.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("armor_stand")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("armour_stand")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("as")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("a_s")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("armorstand")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("armourstand"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = armor_stand]");
			if (world.getLevelData().getGameRules().getBoolean(EssentialAdditionsModGameRules.AMERICANENGLISH) == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"tellraw @p {\"text\":\"Cleared all armor stands.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
			} else if (world.getLevelData().getGameRules().getBoolean(EssentialAdditionsModGameRules.AMERICANENGLISH) == false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"tellraw @p {\"text\":\"Cleared all armour stands.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
			}
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("minecart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("cart"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all minecarts.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("item")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("i"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = item]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all items.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("tnt")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("primed_tnt")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("explosive")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("lit_tnt"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = tnt]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all lit tnt.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("tnt_minecart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("tnt_cart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("tntminecart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("tntcart"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = tnt_minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all TNT minecarts.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("furnace_minecart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("furnaceminecart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("furnace_cart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("furnacecart"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = furnace_minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all furnace minecarts.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else if (((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("aminecart")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("acart"))
				&& (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = furnace_minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = tnt_minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type = minecart]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Cleared all minecarts of every type.\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		}
	}
}

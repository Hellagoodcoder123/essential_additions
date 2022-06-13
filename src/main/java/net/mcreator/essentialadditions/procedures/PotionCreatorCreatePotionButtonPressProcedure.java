package net.mcreator.essentialadditions.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class PotionCreatorCreatePotionButtonPressProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		String potiontype = "";
		if ((guistate.containsKey("text:potionType") ? ((EditBox) guistate.get("text:potionType")).getValue() : "").equals("normal")) {
			potiontype = "potion";
		} else if ((guistate.containsKey("text:potionType") ? ((EditBox) guistate.get("text:potionType")).getValue() : "").equals("splash")) {
			potiontype = "splash_potion";
		} else if ((guistate.containsKey("text:potionType") ? ((EditBox) guistate.get("text:potionType")).getValue() : "").equals("lingering")) {
			potiontype = "lingering_potion";
		} else if ((guistate.containsKey("text:potionType") ? ((EditBox) guistate.get("text:potionType")).getValue() : "").equals("arrow")) {
			potiontype = "tipped_arrow";
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("give @p " + potiontype + "{CustomPotionColor:"
							+ (guistate.containsKey("text:potionColor") ? ((EditBox) guistate.get("text:potionColor")).getValue() : "")
							+ ",CustomPotionEffects:[{Id:"
							+ (guistate.containsKey("text:potionEffects") ? ((EditBox) guistate.get("text:potionEffects")).getValue() : "")
							+ ",Amplifier:"
							+ (guistate.containsKey("text:potionAmplifiers") ? ((EditBox) guistate.get("text:potionAmplifiers")).getValue() : "")
							+ ",Duration:" + new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:potionDurations") ? ((EditBox) guistate.get("text:potionDurations")).getValue() : "")
									* 20
							+ "}],display:{Name:\"{\\\"text\\\":\\\""
							+ (guistate.containsKey("text:potionName") ? ((EditBox) guistate.get("text:potionName")).getValue() : "")
							+ "\\\",\\\"color\\\":\\\""
							+ (guistate.containsKey("text:potionNameColor") ? ((EditBox) guistate.get("text:potionNameColor")).getValue() : "")
							+ "\\\",\\\"bold\\\":\\\"false\\\",\\\"italic\\\":\\\"false\\\"}\"}"));
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}

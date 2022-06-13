package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GiveTrollArrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					"give @p tipped_arrow{CustomPotionEffects:[{Id:2,Amplifier:3,Duration:72000},{Id:4,Amplifier:255,Duration:72000},{Id:9,Amplifier:255,Duration:72000},{Id:15,Amplifier:255,Duration:72000},{Id:16,Amplifier:255,Duration:72000},{Id:18,Amplifier:255,Duration:72000},{Id:31,Amplifier:255,Duration:72000}]}");
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}

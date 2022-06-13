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

public class GiveLingeringInstantKillPotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					"give @p lingering_potion{CustomPotionEffects:[{Id:6,Amplifier:9}],display:{Name:\"{\\\"text\\\":\\\"Lingering Instant Kill Potion\\\",\\\"color\\\":\\\"dark_red\\\",\\\"bold\\\":\\\"false\\\",\\\"italic\\\":\\\"false\\\"}\"}}");
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
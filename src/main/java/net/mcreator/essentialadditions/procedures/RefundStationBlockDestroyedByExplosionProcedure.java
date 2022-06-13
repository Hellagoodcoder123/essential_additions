package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RefundStationBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 2, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~2 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 3, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~3 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x + 4, y, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 4, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~4 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 2, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 2, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~2 ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 3, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 3, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~3 ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z + 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z + 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~2 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z + 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z + 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~2 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 2, y, z + 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 2, y - 1, z + 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~2 ~ ~2 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z + 3))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z + 3))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~3 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z + 3))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z + 3))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~3 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z + 4))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z + 4))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~4 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 2, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 2, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~2 ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 3, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 3, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~3 ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z - 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z - 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~-2 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z - 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z - 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~-2 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 2, y, z - 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 2, y - 1, z - 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~2 ~ ~-2 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 0, y, z - 3))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 0, y - 1, z - 3))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~-3 fire");
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z - 3))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z - 3))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~1 ~ ~-3 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z + 0))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x - 2, y, z + 0))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 2, y - 1, z + 0))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-2 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x - 3, y, z + 0))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 3, y - 1, z + 0))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-3 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x - 4, y, z + 0))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 4, y - 1, z + 0))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-4 ~ ~ fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 2, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 2, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-2 ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 3, y, z + 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 3, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-3 ~ ~1 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z + 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z + 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~2 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 2, y, z + 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 2, y - 1, z + 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-2 ~ ~2 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z + 3))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z + 3))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~3 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 2, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 2, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-2 ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 3, y, z - 1))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 3, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-3 ~ ~-1 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z - 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z - 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~-2 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 2, y, z - 2))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 2, y - 1, z - 2))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-2 ~ ~-2 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z - 3))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z - 3))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~-1 ~ ~-3 fire");
		}
		if ((world.getBlockState(new BlockPos(x - 0, y, z - 4))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x - 0, y - 1, z - 4))).getBlock() == Blocks.AIR)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~-4 fire");
		}
	}
}

package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.screens.Screen;

import java.util.concurrent.atomic.AtomicInteger;

public class RefundStationOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Screen.hasShiftDown()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						("tellraw @p {\"text\":\"There are " + "" + (new Object() {
							public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
								return _retval.get();
							}
						}.getFluidTankLevel(world, new BlockPos(x, y, z), 1))
								+ "mB of lava in this tank\",\"color\":\"orange\",\"bold\":\"false\",\"italic\":\"false\"}"));
		}
	}
}

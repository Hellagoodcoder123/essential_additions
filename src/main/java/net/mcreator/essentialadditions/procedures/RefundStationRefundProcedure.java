package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class RefundStationRefundProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}
}

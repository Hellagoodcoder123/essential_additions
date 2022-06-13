package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.essentialadditions.init.EssentialAdditionsModItems;

public class IsWearingAstroLegsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == EssentialAdditionsModItems.ASTRONAUT_LEGGINGS.get();
	}
}

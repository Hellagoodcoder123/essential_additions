package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class RefundStationBlockIsPlacedByProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EnderMan) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("refundstation").bypassArmor(), 2147483647);
		}
	}
}

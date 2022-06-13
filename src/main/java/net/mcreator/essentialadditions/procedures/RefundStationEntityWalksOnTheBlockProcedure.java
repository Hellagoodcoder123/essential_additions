package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.entity.Entity;

public class RefundStationEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}

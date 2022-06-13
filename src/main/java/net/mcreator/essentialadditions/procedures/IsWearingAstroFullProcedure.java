package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.entity.Entity;

public class IsWearingAstroFullProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return IsWearingAstroLegsProcedure.execute(entity) && IsWearingAstroBootsProcedure.execute(entity)
				&& IsWearingAstroHelmetProcedure.execute(entity) && IsWearingAstroBodyProcedure.execute(entity);
	}
}

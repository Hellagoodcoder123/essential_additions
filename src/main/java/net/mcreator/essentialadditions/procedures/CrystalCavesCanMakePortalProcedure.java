package net.mcreator.essentialadditions.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.LocalPlayer;

public class CrystalCavesCanMakePortalProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return new Object() {
			public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
				if (_ent instanceof ServerPlayer _player)
					return _player.getRecipeBook().contains(recipe);
				else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
					return _player.getRecipeBook().contains(recipe);
				return false;
			}
		}.hasRecipe(entity, new ResourceLocation("minecraft:spyglass"));
	}
}

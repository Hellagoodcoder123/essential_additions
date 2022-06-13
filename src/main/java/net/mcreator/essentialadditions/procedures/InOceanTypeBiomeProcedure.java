package net.mcreator.essentialadditions.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class InOceanTypeBiomeProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBiome(new BlockPos(x, y, z)).value().getRegistryName() != null && BiomeDictionary.hasType(
				ResourceKey.create(Registry.BIOME_REGISTRY,
						world.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY).getKey(world.getBiome(new BlockPos(x, y, z)).value())),
				BiomeDictionary.Type.OCEAN);
	}
}

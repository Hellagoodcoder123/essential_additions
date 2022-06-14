
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.essentialadditions.block.entity.TwoWayRedstonePassBlockEntity;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

public class EssentialAdditionsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			EssentialAdditionsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TWO_WAY_REDSTONE_PASS = register("two_way_redstone_pass",
			EssentialAdditionsModBlocks.TWO_WAY_REDSTONE_PASS, TwoWayRedstonePassBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EssentialAdditionsModTabs {
	public static CreativeModeTab TAB_THE_CRYSTAL_CAVES;

	public static void load() {
		TAB_THE_CRYSTAL_CAVES = new CreativeModeTab("tabthe_crystal_caves") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AMETHYST_CLUSTER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

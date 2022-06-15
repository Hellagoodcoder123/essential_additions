
package net.mcreator.essentialadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.essentialadditions.init.EssentialAdditionsModFluids;

public class LiquidAmethystItem extends BucketItem {
	public LiquidAmethystItem() {
		super(EssentialAdditionsModFluids.LIQUID_AMETHYST,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}

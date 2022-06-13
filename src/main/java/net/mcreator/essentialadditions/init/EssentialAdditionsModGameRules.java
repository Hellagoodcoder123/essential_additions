
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialAdditionsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> AMERICANENGLISH = GameRules.register("americanEnglish", GameRules.Category.CHAT,
			GameRules.BooleanValue.create(false));
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.essentialadditions.EssentialAdditionsMod;

public class EssentialAdditionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, EssentialAdditionsMod.MODID);
	public static final RegistryObject<Potion> TROLL_POTION = REGISTRY.register("troll_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 72000, 3, false, false),
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.CONFUSION, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.WEAKNESS, 72000, 255, false, false),
					new MobEffectInstance(MobEffects.UNLUCK, 72000, 5, false, false),
					new MobEffectInstance(MobEffects.BAD_OMEN, 72000, 255, false, false)));
}

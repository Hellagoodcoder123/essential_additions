
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.essentialadditions.EssentialAdditionsMod;

public class EssentialAdditionsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			EssentialAdditionsMod.MODID);
	public static final RegistryObject<ParticleType<?>> CRYSTAL_CAVES_PORTAL_PARTICLE = REGISTRY.register("crystal_caves_portal_particle",
			() -> new SimpleParticleType(false));
}

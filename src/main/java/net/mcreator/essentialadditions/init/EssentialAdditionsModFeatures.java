
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.essentialadditions.world.features.ores.WoodenBarsFeature;
import net.mcreator.essentialadditions.world.features.ores.StoneBarsFeature;
import net.mcreator.essentialadditions.world.features.ores.NetherIronOreFeature;
import net.mcreator.essentialadditions.world.features.ores.NetherDiamondOreFeature;
import net.mcreator.essentialadditions.world.features.ores.NetherCopperOreFeature;
import net.mcreator.essentialadditions.world.features.ores.GoldBarsFeature;
import net.mcreator.essentialadditions.world.features.ores.DiamondBarsFeature;
import net.mcreator.essentialadditions.world.features.ores.BlackstoneCopperOreFeature;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class EssentialAdditionsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EssentialAdditionsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> GOLD_BARS = register("gold_bars", GoldBarsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GoldBarsFeature.GENERATE_BIOMES, GoldBarsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIAMOND_BARS = register("diamond_bars", DiamondBarsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, DiamondBarsFeature.GENERATE_BIOMES, DiamondBarsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STONE_BARS = register("stone_bars", StoneBarsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, StoneBarsFeature.GENERATE_BIOMES, StoneBarsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WOODEN_BARS = register("wooden_bars", WoodenBarsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WoodenBarsFeature.GENERATE_BIOMES, WoodenBarsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_IRON_ORE = register("nether_iron_ore", NetherIronOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherIronOreFeature.GENERATE_BIOMES,
					NetherIronOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_DIAMOND_ORE = register("nether_diamond_ore", NetherDiamondOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherDiamondOreFeature.GENERATE_BIOMES,
					NetherDiamondOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHERRACK_COPPER_ORE = register("netherrack_copper_ore", NetherCopperOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherCopperOreFeature.GENERATE_BIOMES,
					NetherCopperOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLACKSTONE_COPPER_ORE = register("blackstone_copper_ore", BlackstoneCopperOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BlackstoneCopperOreFeature.GENERATE_BIOMES,
					BlackstoneCopperOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}


/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.essentialadditions.fluid.LiquidAmethystFluid;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

public class EssentialAdditionsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EssentialAdditionsMod.MODID);
	public static final RegistryObject<Fluid> LIQUID_AMETHYST = REGISTRY.register("liquid_amethyst", () -> new LiquidAmethystFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIQUID_AMETHYST = REGISTRY.register("flowing_liquid_amethyst",
			() -> new LiquidAmethystFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_AMETHYST.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_AMETHYST.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}

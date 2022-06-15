
package net.mcreator.essentialadditions.fluid.attributes;

import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import java.util.function.BiFunction;

public class LiquidAmethystFluidAttributes extends FluidAttributes {
	public static CustomBuilder builder(ResourceLocation stillTexture, ResourceLocation flowingTexture) {
		return new CustomBuilder(stillTexture, flowingTexture, LiquidAmethystFluidAttributes::new);
	}

	public static class CustomBuilder extends FluidAttributes.Builder {
		protected CustomBuilder(ResourceLocation stillTexture, ResourceLocation flowingTexture,
				BiFunction<FluidAttributes.Builder, Fluid, FluidAttributes> factory) {
			super(stillTexture, flowingTexture, factory);
		}
	}

	protected LiquidAmethystFluidAttributes(Builder builder, Fluid fluid) {
		super(builder, fluid);
	}

	@Override
	public int getColor(BlockAndTintGetter world, BlockPos pos) {
		return Minecraft.getInstance().level.getBiome(pos).value().getWaterFogColor() | 0xFF000000;
	}
}

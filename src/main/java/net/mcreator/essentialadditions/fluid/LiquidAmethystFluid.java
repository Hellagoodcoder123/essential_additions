
package net.mcreator.essentialadditions.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.essentialadditions.init.EssentialAdditionsModItems;
import net.mcreator.essentialadditions.init.EssentialAdditionsModFluids;
import net.mcreator.essentialadditions.init.EssentialAdditionsModBlocks;
import net.mcreator.essentialadditions.fluid.attributes.LiquidAmethystFluidAttributes;

public abstract class LiquidAmethystFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(EssentialAdditionsModFluids.LIQUID_AMETHYST,
			EssentialAdditionsModFluids.FLOWING_LIQUID_AMETHYST,
			LiquidAmethystFluidAttributes
					.builder(new ResourceLocation("essential_additions:blocks/liquid_amethyst"),
							new ResourceLocation("essential_additions:blocks/liquid_amethyst"))

					.color(-16448205))
			.explosionResistance(100f)

			.tickRate(10)

			.bucket(EssentialAdditionsModItems.LIQUID_AMETHYST_BUCKET).block(() -> (LiquidBlock) EssentialAdditionsModBlocks.LIQUID_AMETHYST.get());

	private LiquidAmethystFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidAmethystFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidAmethystFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

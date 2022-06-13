
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.essentialadditions.block.YellowPlanksBlock;
import net.mcreator.essentialadditions.block.YellowLogBlock;
import net.mcreator.essentialadditions.block.WoodenBarsBlock;
import net.mcreator.essentialadditions.block.WhitePlanksBlock;
import net.mcreator.essentialadditions.block.WhiteLogBlock;
import net.mcreator.essentialadditions.block.TwoWayRedstonePassBlock;
import net.mcreator.essentialadditions.block.StoneBarsBlock;
import net.mcreator.essentialadditions.block.SolidAirBlock;
import net.mcreator.essentialadditions.block.RefundStationBlock;
import net.mcreator.essentialadditions.block.RedPlanksBlock;
import net.mcreator.essentialadditions.block.RedLogBlock;
import net.mcreator.essentialadditions.block.PurplePlanksBlock;
import net.mcreator.essentialadditions.block.PurpleLogBlock;
import net.mcreator.essentialadditions.block.PinkPlanksBlock;
import net.mcreator.essentialadditions.block.PinkLogBlock;
import net.mcreator.essentialadditions.block.OrangePlanksBlock;
import net.mcreator.essentialadditions.block.OrangeLogBlock;
import net.mcreator.essentialadditions.block.MagentaPlanksBlock;
import net.mcreator.essentialadditions.block.MagentaLogBlock;
import net.mcreator.essentialadditions.block.LimeLogBlock;
import net.mcreator.essentialadditions.block.LightGrayPlanksBlock;
import net.mcreator.essentialadditions.block.LightGrayLogBlock;
import net.mcreator.essentialadditions.block.LightBluePlanksBlock;
import net.mcreator.essentialadditions.block.LightBlueLogBlock;
import net.mcreator.essentialadditions.block.JumpPad9Block;
import net.mcreator.essentialadditions.block.JumpPad8Block;
import net.mcreator.essentialadditions.block.JumpPad7Block;
import net.mcreator.essentialadditions.block.JumpPad6Block;
import net.mcreator.essentialadditions.block.JumpPad5Block;
import net.mcreator.essentialadditions.block.JumpPad4Block;
import net.mcreator.essentialadditions.block.JumpPad3Block;
import net.mcreator.essentialadditions.block.JumpPad2Block;
import net.mcreator.essentialadditions.block.JumpPad1Block;
import net.mcreator.essentialadditions.block.JumpPad15Block;
import net.mcreator.essentialadditions.block.JumpPad14Block;
import net.mcreator.essentialadditions.block.JumpPad13Block;
import net.mcreator.essentialadditions.block.JumpPad12Block;
import net.mcreator.essentialadditions.block.JumpPad11Block;
import net.mcreator.essentialadditions.block.JumpPad10Block;
import net.mcreator.essentialadditions.block.GreenPlanksBlock;
import net.mcreator.essentialadditions.block.GreenLogBlock;
import net.mcreator.essentialadditions.block.GrayPlanksBlock;
import net.mcreator.essentialadditions.block.GrayLogBlock;
import net.mcreator.essentialadditions.block.GoldBarsBlock;
import net.mcreator.essentialadditions.block.DiamondBarsBlock;
import net.mcreator.essentialadditions.block.DarkGreenPlanksBlock;
import net.mcreator.essentialadditions.block.CyanPlanksBlock;
import net.mcreator.essentialadditions.block.CyanLogBlock;
import net.mcreator.essentialadditions.block.CauldronDummyBlock;
import net.mcreator.essentialadditions.block.BrownPlanksBlock;
import net.mcreator.essentialadditions.block.BrownLogBlock;
import net.mcreator.essentialadditions.block.BluePlanksBlock;
import net.mcreator.essentialadditions.block.BlueLogBlock;
import net.mcreator.essentialadditions.block.BlackPlanksBlock;
import net.mcreator.essentialadditions.block.BlackLogBlock;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

public class EssentialAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EssentialAdditionsMod.MODID);
	public static final RegistryObject<Block> REFUND_STATION = REGISTRY.register("refund_station", () -> new RefundStationBlock());
	public static final RegistryObject<Block> RED_PLANKS = REGISTRY.register("red_planks", () -> new RedPlanksBlock());
	public static final RegistryObject<Block> JUMP_PAD_1 = REGISTRY.register("jump_pad_1", () -> new JumpPad1Block());
	public static final RegistryObject<Block> JUMP_PAD_2 = REGISTRY.register("jump_pad_2", () -> new JumpPad2Block());
	public static final RegistryObject<Block> JUMP_PAD_3 = REGISTRY.register("jump_pad_3", () -> new JumpPad3Block());
	public static final RegistryObject<Block> JUMP_PAD_4 = REGISTRY.register("jump_pad_4", () -> new JumpPad4Block());
	public static final RegistryObject<Block> JUMP_PAD_5 = REGISTRY.register("jump_pad_5", () -> new JumpPad5Block());
	public static final RegistryObject<Block> ORANGE_PLANKS = REGISTRY.register("orange_planks", () -> new OrangePlanksBlock());
	public static final RegistryObject<Block> GREEN_PLANKS = REGISTRY.register("green_planks", () -> new GreenPlanksBlock());
	public static final RegistryObject<Block> DARK_GREEN_PLANKS = REGISTRY.register("dark_green_planks", () -> new DarkGreenPlanksBlock());
	public static final RegistryObject<Block> MAGENTA_PLANKS = REGISTRY.register("magenta_planks", () -> new MagentaPlanksBlock());
	public static final RegistryObject<Block> PURPLE_PLANKS = REGISTRY.register("purple_planks", () -> new PurplePlanksBlock());
	public static final RegistryObject<Block> YELLOW_PLANKS = REGISTRY.register("yellow_planks", () -> new YellowPlanksBlock());
	public static final RegistryObject<Block> BLACK_PLANKS = REGISTRY.register("black_planks", () -> new BlackPlanksBlock());
	public static final RegistryObject<Block> BLUE_PLANKS = REGISTRY.register("blue_planks", () -> new BluePlanksBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = REGISTRY.register("light_blue_planks", () -> new LightBluePlanksBlock());
	public static final RegistryObject<Block> CYAN_PLANKS = REGISTRY.register("cyan_planks", () -> new CyanPlanksBlock());
	public static final RegistryObject<Block> BROWN_PLANKS = REGISTRY.register("brown_planks", () -> new BrownPlanksBlock());
	public static final RegistryObject<Block> WHITE_PLANKS = REGISTRY.register("white_planks", () -> new WhitePlanksBlock());
	public static final RegistryObject<Block> GRAY_PLANKS = REGISTRY.register("gray_planks", () -> new GrayPlanksBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = REGISTRY.register("light_gray_planks", () -> new LightGrayPlanksBlock());
	public static final RegistryObject<Block> PINK_PLANKS = REGISTRY.register("pink_planks", () -> new PinkPlanksBlock());
	public static final RegistryObject<Block> JUMP_PAD_6 = REGISTRY.register("jump_pad_6", () -> new JumpPad6Block());
	public static final RegistryObject<Block> JUMP_PAD_7 = REGISTRY.register("jump_pad_7", () -> new JumpPad7Block());
	public static final RegistryObject<Block> JUMP_PAD_8 = REGISTRY.register("jump_pad_8", () -> new JumpPad8Block());
	public static final RegistryObject<Block> JUMP_PAD_9 = REGISTRY.register("jump_pad_9", () -> new JumpPad9Block());
	public static final RegistryObject<Block> JUMP_PAD_10 = REGISTRY.register("jump_pad_10", () -> new JumpPad10Block());
	public static final RegistryObject<Block> JUMP_PAD_11 = REGISTRY.register("jump_pad_11", () -> new JumpPad11Block());
	public static final RegistryObject<Block> JUMP_PAD_12 = REGISTRY.register("jump_pad_12", () -> new JumpPad12Block());
	public static final RegistryObject<Block> JUMP_PAD_13 = REGISTRY.register("jump_pad_13", () -> new JumpPad13Block());
	public static final RegistryObject<Block> JUMP_PAD_14 = REGISTRY.register("jump_pad_14", () -> new JumpPad14Block());
	public static final RegistryObject<Block> JUMP_PAD_15 = REGISTRY.register("jump_pad_15", () -> new JumpPad15Block());
	public static final RegistryObject<Block> GOLD_BARS = REGISTRY.register("gold_bars", () -> new GoldBarsBlock());
	public static final RegistryObject<Block> DIAMOND_BARS = REGISTRY.register("diamond_bars", () -> new DiamondBarsBlock());
	public static final RegistryObject<Block> STONE_BARS = REGISTRY.register("stone_bars", () -> new StoneBarsBlock());
	public static final RegistryObject<Block> WOODEN_BARS = REGISTRY.register("wooden_bars", () -> new WoodenBarsBlock());
	public static final RegistryObject<Block> RED_LOG = REGISTRY.register("red_log", () -> new RedLogBlock());
	public static final RegistryObject<Block> ORANGE_LOG = REGISTRY.register("orange_log", () -> new OrangeLogBlock());
	public static final RegistryObject<Block> GREEN_LOG = REGISTRY.register("green_log", () -> new GreenLogBlock());
	public static final RegistryObject<Block> LIME_LOG = REGISTRY.register("lime_log", () -> new LimeLogBlock());
	public static final RegistryObject<Block> PINK_LOG = REGISTRY.register("pink_log", () -> new PinkLogBlock());
	public static final RegistryObject<Block> MAGENTA_LOG = REGISTRY.register("magenta_log", () -> new MagentaLogBlock());
	public static final RegistryObject<Block> PURPLE_LOG = REGISTRY.register("purple_log", () -> new PurpleLogBlock());
	public static final RegistryObject<Block> BLACK_LOG = REGISTRY.register("black_log", () -> new BlackLogBlock());
	public static final RegistryObject<Block> GRAY_LOG = REGISTRY.register("gray_log", () -> new GrayLogBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_LOG = REGISTRY.register("light_gray_log", () -> new LightGrayLogBlock());
	public static final RegistryObject<Block> WHITE_LOG = REGISTRY.register("white_log", () -> new WhiteLogBlock());
	public static final RegistryObject<Block> BROWN_LOG = REGISTRY.register("brown_log", () -> new BrownLogBlock());
	public static final RegistryObject<Block> BLUE_LOG = REGISTRY.register("blue_log", () -> new BlueLogBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_LOG = REGISTRY.register("light_blue_log", () -> new LightBlueLogBlock());
	public static final RegistryObject<Block> CYAN_LOG = REGISTRY.register("cyan_log", () -> new CyanLogBlock());
	public static final RegistryObject<Block> YELLOW_LOG = REGISTRY.register("yellow_log", () -> new YellowLogBlock());
	public static final RegistryObject<Block> CAULDRON_DUMMY = REGISTRY.register("cauldron_dummy", () -> new CauldronDummyBlock());
	public static final RegistryObject<Block> TWO_WAY_REDSTONE_PASS = REGISTRY.register("two_way_redstone_pass", () -> new TwoWayRedstonePassBlock());
	public static final RegistryObject<Block> SOLID_AIR = REGISTRY.register("solid_air", () -> new SolidAirBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			JumpPad1Block.registerRenderLayer();
			JumpPad2Block.registerRenderLayer();
			JumpPad3Block.registerRenderLayer();
			JumpPad4Block.registerRenderLayer();
			JumpPad5Block.registerRenderLayer();
			JumpPad6Block.registerRenderLayer();
			JumpPad7Block.registerRenderLayer();
			JumpPad8Block.registerRenderLayer();
			JumpPad9Block.registerRenderLayer();
			JumpPad10Block.registerRenderLayer();
			JumpPad11Block.registerRenderLayer();
			JumpPad12Block.registerRenderLayer();
			JumpPad13Block.registerRenderLayer();
			JumpPad14Block.registerRenderLayer();
			JumpPad15Block.registerRenderLayer();
			GoldBarsBlock.registerRenderLayer();
			DiamondBarsBlock.registerRenderLayer();
			StoneBarsBlock.registerRenderLayer();
			WoodenBarsBlock.registerRenderLayer();
			CauldronDummyBlock.registerRenderLayer();
			TwoWayRedstonePassBlock.registerRenderLayer();
			SolidAirBlock.registerRenderLayer();
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.essentialadditions.client.gui.RefundStationGUIScreen;
import net.mcreator.essentialadditions.client.gui.PotionCreatorTrollPotionsScreen;
import net.mcreator.essentialadditions.client.gui.PotionCreatorTemplatesScreen;
import net.mcreator.essentialadditions.client.gui.PotionCreatorScreen;
import net.mcreator.essentialadditions.client.gui.PotionCreatorInstantKillPotionsScreen;
import net.mcreator.essentialadditions.client.gui.PotionCreatorCreatePotionScreen;
import net.mcreator.essentialadditions.client.gui.CalculatorScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EssentialAdditionsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EssentialAdditionsModMenus.REFUND_STATION_GUI, RefundStationGUIScreen::new);
			MenuScreens.register(EssentialAdditionsModMenus.POTION_CREATOR_TEMPLATES, PotionCreatorTemplatesScreen::new);
			MenuScreens.register(EssentialAdditionsModMenus.POTION_CREATOR, PotionCreatorScreen::new);
			MenuScreens.register(EssentialAdditionsModMenus.POTION_CREATOR_INSTANT_KILL_POTIONS, PotionCreatorInstantKillPotionsScreen::new);
			MenuScreens.register(EssentialAdditionsModMenus.POTION_CREATOR_TROLL_POTIONS, PotionCreatorTrollPotionsScreen::new);
			MenuScreens.register(EssentialAdditionsModMenus.POTION_CREATOR_CREATE_POTION, PotionCreatorCreatePotionScreen::new);
			MenuScreens.register(EssentialAdditionsModMenus.CALCULATOR, CalculatorScreen::new);
		});
	}
}

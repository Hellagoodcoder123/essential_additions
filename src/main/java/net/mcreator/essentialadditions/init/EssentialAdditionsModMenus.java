
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.essentialadditions.world.inventory.RefundStationGUIMenu;
import net.mcreator.essentialadditions.world.inventory.PotionCreatorTrollPotionsMenu;
import net.mcreator.essentialadditions.world.inventory.PotionCreatorTemplatesMenu;
import net.mcreator.essentialadditions.world.inventory.PotionCreatorMenu;
import net.mcreator.essentialadditions.world.inventory.PotionCreatorInstantKillPotionsMenu;
import net.mcreator.essentialadditions.world.inventory.PotionCreatorCreatePotionMenu;
import net.mcreator.essentialadditions.world.inventory.CalculatorMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialAdditionsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<RefundStationGUIMenu> REFUND_STATION_GUI = register("refund_station_gui",
			(id, inv, extraData) -> new RefundStationGUIMenu(id, inv, extraData));
	public static final MenuType<PotionCreatorTemplatesMenu> POTION_CREATOR_TEMPLATES = register("potion_creator_templates",
			(id, inv, extraData) -> new PotionCreatorTemplatesMenu(id, inv, extraData));
	public static final MenuType<PotionCreatorMenu> POTION_CREATOR = register("potion_creator",
			(id, inv, extraData) -> new PotionCreatorMenu(id, inv, extraData));
	public static final MenuType<PotionCreatorInstantKillPotionsMenu> POTION_CREATOR_INSTANT_KILL_POTIONS = register(
			"potion_creator_instant_kill_potions", (id, inv, extraData) -> new PotionCreatorInstantKillPotionsMenu(id, inv, extraData));
	public static final MenuType<PotionCreatorTrollPotionsMenu> POTION_CREATOR_TROLL_POTIONS = register("potion_creator_troll_potions",
			(id, inv, extraData) -> new PotionCreatorTrollPotionsMenu(id, inv, extraData));
	public static final MenuType<PotionCreatorCreatePotionMenu> POTION_CREATOR_CREATE_POTION = register("potion_creator_create_potion",
			(id, inv, extraData) -> new PotionCreatorCreatePotionMenu(id, inv, extraData));
	public static final MenuType<CalculatorMenu> CALCULATOR = register("calculator", (id, inv, extraData) -> new CalculatorMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}

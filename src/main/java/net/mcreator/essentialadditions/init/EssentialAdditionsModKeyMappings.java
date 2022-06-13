
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.essentialadditions.network.CommandKeybindMessage;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EssentialAdditionsModKeyMappings {
	public static final KeyMapping COMMAND_KEYBIND = new KeyMapping("key.essential_additions.command_keybind", GLFW.GLFW_KEY_KP_0,
			"key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(COMMAND_KEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == COMMAND_KEYBIND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						EssentialAdditionsMod.PACKET_HANDLER.sendToServer(new CommandKeybindMessage(0, 0));
						CommandKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}

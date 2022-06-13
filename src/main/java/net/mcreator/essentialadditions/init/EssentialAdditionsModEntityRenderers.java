
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.essentialadditions.client.renderer.TallEndermanRenderer;
import net.mcreator.essentialadditions.client.renderer.BombRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EssentialAdditionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EssentialAdditionsModEntities.BOMB.get(), BombRenderer::new);
		event.registerEntityRenderer(EssentialAdditionsModEntities.TALL_ENDERMAN.get(), TallEndermanRenderer::new);
	}
}

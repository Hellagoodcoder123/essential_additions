
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.essentialadditions.client.model.Modeltall_enderman;
import net.mcreator.essentialadditions.client.model.Modelcustom_model;
import net.mcreator.essentialadditions.client.model.Modelbomb_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EssentialAdditionsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbomb_model.LAYER_LOCATION, Modelbomb_model::createBodyLayer);
		event.registerLayerDefinition(Modeltall_enderman.LAYER_LOCATION, Modeltall_enderman::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}

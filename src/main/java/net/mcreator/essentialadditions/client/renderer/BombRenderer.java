
package net.mcreator.essentialadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.essentialadditions.entity.BombEntity;
import net.mcreator.essentialadditions.client.model.Modelcustom_model;

public class BombRenderer extends MobRenderer<BombEntity, Modelcustom_model<BombEntity>> {
	public BombRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BombEntity entity) {
		return new ResourceLocation("essential_additions:textures/bomb_fuse.png");
	}
}

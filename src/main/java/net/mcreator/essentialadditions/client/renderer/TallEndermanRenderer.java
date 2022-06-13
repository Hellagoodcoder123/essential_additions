
package net.mcreator.essentialadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.essentialadditions.entity.TallEndermanEntity;
import net.mcreator.essentialadditions.client.model.Modeltall_enderman;

public class TallEndermanRenderer extends MobRenderer<TallEndermanEntity, Modeltall_enderman<TallEndermanEntity>> {
	public TallEndermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltall_enderman(context.bakeLayer(Modeltall_enderman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TallEndermanEntity entity) {
		return new ResourceLocation("essential_additions:textures/tall_enderman_1.png");
	}
}

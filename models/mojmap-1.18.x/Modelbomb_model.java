
// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbomb_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("essential_additions", "bomb_model"), "main");
	public final ModelPart bb_main;

	public Modelbomb_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(34, 46)
						.addBox(-5.0F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 21)
						.addBox(3.0F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-6.0F, -37.0F, -3.0F, 12.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 42)
						.addBox(7.0F, -37.0F, -1.0F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 21)
						.addBox(-9.0F, -37.0F, -1.0F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 4)
						.addBox(-9.0F, -37.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(3.0F, -37.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -48.0F, -5.0F, 14.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -47.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class guineapig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "guineapig"), "main");
	private final ModelPart bone2;
	private final ModelPart bone;

	public guineapig(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 55).addBox(-5.0F, -12.0F, 15.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(43, 32).addBox(-7.0F, -12.0F, 3.0F, 11.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(47, 0).addBox(-6.0F, -12.0F, 6.0F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -12.0F, -10.0F, 13.0F, 11.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-7.0F, -13.0F, -9.0F, 11.0F, 2.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(10, 39).addBox(2.0F, -13.0F, 12.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-8.0F, -13.0F, 12.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 55).addBox(-4.0F, -13.0F, 10.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
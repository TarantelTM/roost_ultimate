
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenrottenEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenrottenRenderer extends MobRenderer<AChickenrottenEntity, ChickenModel<AChickenrottenEntity>> {
	public AChickenrottenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenrottenEntity entity) {
		return new ResourceLocation("chicken_roost:textures/rich_slag_chicken.png");
	}
}

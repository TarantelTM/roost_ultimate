
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenNetherStarEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenNetherStarRenderer extends MobRenderer<AChickenNetherStarEntity, ChickenModel<AChickenNetherStarEntity>> {
	public AChickenNetherStarRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenNetherStarEntity entity) {
		return new ResourceLocation("chicken_roost:textures/energetic_alloy_chicken.png");
	}
}

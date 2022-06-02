
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenappleEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenappleRenderer extends MobRenderer<AChickenappleEntity, ChickenModel<AChickenappleEntity>> {
	public AChickenappleRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenappleEntity entity) {
		return new ResourceLocation("chicken_roost:textures/restonia_crystal_chicken.png");
	}
}


package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenAEChargedCertusEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenAEChargedCertusRenderer extends MobRenderer<AChickenAEChargedCertusEntity, ChickenModel<AChickenAEChargedCertusEntity>> {
	public AChickenAEChargedCertusRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenAEChargedCertusEntity entity) {
		return new ResourceLocation("chicken_roost:textures/quartz_enriched_iron_chicken.png");
	}
}


package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenTitaniumEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenTitaniumRenderer extends MobRenderer<AChickenTitaniumEntity, ChickenModel<AChickenTitaniumEntity>> {
	public AChickenTitaniumRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenTitaniumEntity entity) {
		return new ResourceLocation("chicken_roost:textures/titanium_chicken.png");
	}
}

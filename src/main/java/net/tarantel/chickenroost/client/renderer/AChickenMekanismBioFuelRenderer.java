
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenMekanismBioFuelEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenMekanismBioFuelRenderer extends MobRenderer<AChickenMekanismBioFuelEntity, ChickenModel<AChickenMekanismBioFuelEntity>> {
	public AChickenMekanismBioFuelRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenMekanismBioFuelEntity entity) {
		return new ResourceLocation("chicken_roost:textures/enderium_chicken.png");
	}
}

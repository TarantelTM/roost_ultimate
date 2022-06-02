
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenEmeraldEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class AChickenEmeraldRenderer extends MobRenderer<AChickenEmeraldEntity, ChickenModel<AChickenEmeraldEntity>> {
	public AChickenEmeraldRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenEmeraldEntity entity) {
		return new ResourceLocation("chicken_roost:textures/emeradic_crystal_chicken.png");
	}
}

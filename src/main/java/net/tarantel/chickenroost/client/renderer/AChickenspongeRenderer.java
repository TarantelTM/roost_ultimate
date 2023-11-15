
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.vanilla.AChickenspongeEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenspongeRenderer extends MobRenderer<AChickenspongeEntity, Modelchicken<AChickenspongeEntity>> {
	public AChickenspongeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenspongeEntity entity) {
		return new ResourceLocation("chicken_roost:textures/brass_chicken.png");
	}
}

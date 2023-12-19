
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.mods.silentgems.AChickenSapphireEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenSapphireRenderer extends MobRenderer<AChickenSapphireEntity, Modelchicken<AChickenSapphireEntity>> {
	public AChickenSapphireRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenSapphireEntity entity) {
		return new ResourceLocation("chicken_roost:textures/entities/sapphire_chicken.png");
	}
}

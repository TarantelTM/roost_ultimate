
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.tarantel.chickenroost.client.gui.TrainerGUIScreen;
import net.tarantel.chickenroost.client.gui.RoostguiScreen;
import net.tarantel.chickenroost.client.gui.HdfhdfhScreen;
import net.tarantel.chickenroost.client.gui.CheesemakerguiScreen;
import net.tarantel.chickenroost.client.gui.BreederguiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChickenRoostModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUI, RoostguiScreen::new);
			MenuScreens.register(ChickenRoostModMenus.HDFHDFH, HdfhdfhScreen::new);
			MenuScreens.register(ChickenRoostModMenus.BREEDERGUI, BreederguiScreen::new);
			MenuScreens.register(ChickenRoostModMenus.TRAINER_GUI, TrainerGUIScreen::new);
			MenuScreens.register(ChickenRoostModMenus.CHEESEMAKERGUI, CheesemakerguiScreen::new);
		});
	}
}

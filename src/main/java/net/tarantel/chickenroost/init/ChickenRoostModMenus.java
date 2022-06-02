
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.tarantel.chickenroost.world.inventory.TrainerGUIMenu;
import net.tarantel.chickenroost.world.inventory.RoostguiMenu;
import net.tarantel.chickenroost.world.inventory.HdfhdfhMenu;
import net.tarantel.chickenroost.world.inventory.CheesemakerguiMenu;
import net.tarantel.chickenroost.world.inventory.BreederguiMenu;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChickenRoostModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<RoostguiMenu> ROOSTGUI = register("roostgui", (id, inv, extraData) -> new RoostguiMenu(id, inv, extraData));
	public static final MenuType<HdfhdfhMenu> HDFHDFH = register("hdfhdfh", (id, inv, extraData) -> new HdfhdfhMenu(id, inv, extraData));
	public static final MenuType<BreederguiMenu> BREEDERGUI = register("breedergui", (id, inv, extraData) -> new BreederguiMenu(id, inv, extraData));
	public static final MenuType<TrainerGUIMenu> TRAINER_GUI = register("trainer_gui",
			(id, inv, extraData) -> new TrainerGUIMenu(id, inv, extraData));
	public static final MenuType<CheesemakerguiMenu> CHEESEMAKERGUI = register("cheesemakergui",
			(id, inv, extraData) -> new CheesemakerguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}

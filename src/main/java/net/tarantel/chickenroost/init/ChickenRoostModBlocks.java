
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.tarantel.chickenroost.block.Testblock3Block;
import net.tarantel.chickenroost.block.Testblock2Block;
import net.tarantel.chickenroost.block.Testblock1Block;
import net.tarantel.chickenroost.block.RoostcobbleBlock;
import net.tarantel.chickenroost.block.RoostboxwithchickenBlock;
import net.tarantel.chickenroost.block.RoostEmptyBlock;
import net.tarantel.chickenroost.block.RoostChickenOsmiumBlock;
import net.tarantel.chickenroost.block.RoostChickenFlintBlock;
import net.tarantel.chickenroost.block.RoostChickenCobbleBlock;
import net.tarantel.chickenroost.block.RoostBlock;
import net.tarantel.chickenroost.block.ChickenTrainerBlock;
import net.tarantel.chickenroost.block.CheesemakerBlock;
import net.tarantel.chickenroost.block.BreederclosedBlock;
import net.tarantel.chickenroost.block.BreederBlock;
import net.tarantel.chickenroost.block.AlphaRoostContainerBlock;
import net.tarantel.chickenroost.ChickenRoostMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class ChickenRoostModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChickenRoostMod.MODID);
	public static final RegistryObject<Block> ROOST = REGISTRY.register("roost", () -> new RoostBlock());
	public static final RegistryObject<Block> ROOST_EMPTY = REGISTRY.register("roost_empty", () -> new RoostEmptyBlock());
	public static final RegistryObject<Block> ROOSTBOXWITHCHICKEN = REGISTRY.register("roostboxwithchicken", () -> new RoostboxwithchickenBlock());
	public static final RegistryObject<Block> ROOST_CHICKEN_COBBLE = REGISTRY.register("roost_chicken_cobble", () -> new RoostChickenCobbleBlock());
	public static final RegistryObject<Block> ROOST_CHICKEN_FLINT = REGISTRY.register("roost_chicken_flint", () -> new RoostChickenFlintBlock());
	public static final RegistryObject<Block> ROOST_CHICKEN_OSMIUM = REGISTRY.register("roost_chicken_osmium", () -> new RoostChickenOsmiumBlock());
	public static final RegistryObject<Block> ALPHA_ROOST_CONTAINER = REGISTRY.register("alpha_roost_container",
			() -> new AlphaRoostContainerBlock());
	public static final RegistryObject<Block> BREEDER = REGISTRY.register("breeder", () -> new BreederBlock());
	public static final RegistryObject<Block> TESTBLOCK_1 = REGISTRY.register("testblock_1", () -> new Testblock1Block());
	public static final RegistryObject<Block> TESTBLOCK_2 = REGISTRY.register("testblock_2", () -> new Testblock2Block());
	public static final RegistryObject<Block> TESTBLOCK_3 = REGISTRY.register("testblock_3", () -> new Testblock3Block());
	public static final RegistryObject<Block> BREEDERCLOSED = REGISTRY.register("breederclosed", () -> new BreederclosedBlock());
	public static final RegistryObject<Block> ROOSTCOBBLE = REGISTRY.register("roostcobble", () -> new RoostcobbleBlock());
	public static final RegistryObject<Block> CHICKEN_TRAINER = REGISTRY.register("chicken_trainer", () -> new ChickenTrainerBlock());
	public static final RegistryObject<Block> CHEESEMAKER = REGISTRY.register("cheesemaker", () -> new CheesemakerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RoostBlock.registerRenderLayer();
			RoostEmptyBlock.registerRenderLayer();
			RoostboxwithchickenBlock.registerRenderLayer();
			RoostChickenCobbleBlock.registerRenderLayer();
			RoostChickenFlintBlock.registerRenderLayer();
			RoostChickenOsmiumBlock.registerRenderLayer();
			AlphaRoostContainerBlock.registerRenderLayer();
			BreederBlock.registerRenderLayer();
			Testblock1Block.registerRenderLayer();
			BreederclosedBlock.registerRenderLayer();
			RoostcobbleBlock.registerRenderLayer();
			ChickenTrainerBlock.registerRenderLayer();
		}
	}
}

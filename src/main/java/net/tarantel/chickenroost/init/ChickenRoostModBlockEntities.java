
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.tarantel.chickenroost.block.entity.Testblock3BlockEntity;
import net.tarantel.chickenroost.block.entity.Testblock2BlockEntity;
import net.tarantel.chickenroost.block.entity.RoostcobbleBlockEntity;
import net.tarantel.chickenroost.block.entity.RoostboxwithchickenBlockEntity;
import net.tarantel.chickenroost.block.entity.RoostChickenOsmiumBlockEntity;
import net.tarantel.chickenroost.block.entity.RoostChickenFlintBlockEntity;
import net.tarantel.chickenroost.block.entity.RoostChickenCobbleBlockEntity;
import net.tarantel.chickenroost.block.entity.RoostBlockEntity;
import net.tarantel.chickenroost.block.entity.ChickenTrainerBlockEntity;
import net.tarantel.chickenroost.block.entity.CheesemakerBlockEntity;
import net.tarantel.chickenroost.block.entity.BreederBlockEntity;
import net.tarantel.chickenroost.block.entity.AlphaRoostContainerBlockEntity;
import net.tarantel.chickenroost.ChickenRoostMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class ChickenRoostModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ChickenRoostMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ROOST = register("roost", ChickenRoostModBlocks.ROOST, RoostBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROOSTBOXWITHCHICKEN = register("roostboxwithchicken",
			ChickenRoostModBlocks.ROOSTBOXWITHCHICKEN, RoostboxwithchickenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROOST_CHICKEN_COBBLE = register("roost_chicken_cobble",
			ChickenRoostModBlocks.ROOST_CHICKEN_COBBLE, RoostChickenCobbleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROOST_CHICKEN_FLINT = register("roost_chicken_flint",
			ChickenRoostModBlocks.ROOST_CHICKEN_FLINT, RoostChickenFlintBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROOST_CHICKEN_OSMIUM = register("roost_chicken_osmium",
			ChickenRoostModBlocks.ROOST_CHICKEN_OSMIUM, RoostChickenOsmiumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALPHA_ROOST_CONTAINER = register("alpha_roost_container",
			ChickenRoostModBlocks.ALPHA_ROOST_CONTAINER, AlphaRoostContainerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BREEDER = register("breeder", ChickenRoostModBlocks.BREEDER, BreederBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TESTBLOCK_2 = register("testblock_2", ChickenRoostModBlocks.TESTBLOCK_2,
			Testblock2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TESTBLOCK_3 = register("testblock_3", ChickenRoostModBlocks.TESTBLOCK_3,
			Testblock3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROOSTCOBBLE = register("roostcobble", ChickenRoostModBlocks.ROOSTCOBBLE,
			RoostcobbleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHICKEN_TRAINER = register("chicken_trainer", ChickenRoostModBlocks.CHICKEN_TRAINER,
			ChickenTrainerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEESEMAKER = register("cheesemaker", ChickenRoostModBlocks.CHEESEMAKER,
			CheesemakerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

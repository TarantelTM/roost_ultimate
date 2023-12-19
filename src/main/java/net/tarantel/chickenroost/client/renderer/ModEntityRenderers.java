
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.client.renderer;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import net.neoforged.fml.common.Mod;
import net.tarantel.chickenroost.entity.ModEntities;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModEntities.A_CHICKEN_COBBLE.get(), AChickenCobbleRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_FLINT.get(), AChickenFlintRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SAND.get(), AChickenSandRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_GRAVEL.get(), AChickenGravelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_GRANIT.get(), AChickenGranitRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ANDERSITE.get(), AChickenAndersiteRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_COPPER.get(), AChickenCopperRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_IRON.get(), AChickenIronRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_REDSTONE.get(), AChickenRedstoneRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_LAPIS.get(), AChickenLapisRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_DIAMOND.get(), AChickenDiamondRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_OBSIDIAN.get(), AChickenObsidianRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_GOLD.get(), AChickenGoldRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SLIME.get(), AChickenSlimeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BIRCHWOOD.get(), AChickenBirchwoodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_OAKWOOD.get(), AChickenOakwoodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_OSMIUM.get(), AChickenOsmiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MEKANISM_TIN.get(), AChickenMekanismTinRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MEKANISM_BRONZE.get(), AChickenMekanismBronzeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MEKANISM_STEEL.get(), AChickenMekanismSteelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MEKANISM_URANIUM.get(), AChickenMekanismUraniumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MEKANISM_LEAD.get(), AChickenMekanismLeadRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MEKANISM_BIO_FUEL.get(), AChickenMekanismBioFuelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_AE_SILICON.get(), AChickenAESiliconRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_AE_CERTUS_QUARTZ.get(), AChickenAECertusQuartzRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_AE_FLUIX_CRYSTAL.get(), AChickenAEFluixCrystalRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_AE_CHARGED_CERTUS.get(), AChickenAEChargedCertusRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BOTANIA_MANASTEEL.get(), AChickenBotaniaManasteelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BOTANIA_TERRASTEEL.get(), AChickenBotaniaTerrasteelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BOTANIA_ELEMENTIUM.get(), AChickenBotaniaElementiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BOTANIA_LIVINGROCK.get(), AChickenBotaniaLivingrockRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BOTANIA_LIVINGWOOD.get(), AChickenBotaniaLivingwoodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CRIMSTON_STEM.get(), AChickenCrimstonStemRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_WARPED_STEM.get(), AChickenWarpedStemRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SPRUCEWOOD.get(), AChickenSprucewoodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_GLASS.get(), AChickenGlassRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_WOOL.get(), AChickenWoolRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SOUL_SAND.get(), AChickenSoulSandRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NETHERRACK.get(), AChickenNetherrackRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SOUL_SOIL.get(), AChickenSoulSoilRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BASALT.get(), AChickenBasaltRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_INK.get(), AChickenInkRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_PAPER.get(), AChickenPaperRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CLAY.get(), AChickenClayRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_QUARTZ.get(), AChickenQuartzRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_AMETHYST_SHARD.get(), AChickenAmethystShardRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_EMERALD.get(), AChickenEmeraldRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_TNT.get(), AChickenTNTRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_DIORITE.get(), AChickenDioriteRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_STONE.get(), AChickenStoneRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NETHER_STAR.get(), AChickenNetherStarRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NETHER_WART.get(), AChickenNetherWartRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ENDER_EYE.get(), AChickenEnderEyeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_GLOWSTONE.get(), AChickenGlowstoneRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BLAZE_ROD.get(), AChickenBlazeRodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SUGAR.get(), AChickenSugarRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BONE_MEAL.get(), AChickenBoneMealRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ENDER_PEARL.get(), AChickenEnderPearlRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BONE.get(), AChickenBoneRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_DARK_OAK.get(), AChickenDarkOakRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ACACIA_WOOD.get(), AChickenAcaciaWoodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_JUNGLE_WOOD.get(), AChickenJungleWoodRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NAUTILUS_SHELL.get(), AChickenNautilusShellRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_HONEYCOMB.get(), AChickenHoneycombRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_RABBIT_HIDE.get(), AChickenRabbitHideRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_PRISMARINE_SHARD.get(), AChickenPrismarineShardRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NETHER_BRICK.get(), AChickenNetherBrickRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CHORUS_FRUIT.get(), AChickenChorusFruitRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_COAL.get(), AChickenCoalRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CHAR_COAL.get(), AChickenCharCoalRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_LEATHER.get(), AChickenLeatherRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_STRING.get(), AChickenStringRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_FEATHER.get(), AChickenFeatherRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENSNOW.get(), AChickensnowRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENAPPLE.get(), AChickenappleRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENSPONGE.get(), AChickenspongeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENMELON.get(), AChickenmelonRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENMAGMACREAM.get(), AChickenmagmacreamRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENBLAZEPOWDER.get(), AChickenblazepowderRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENGLOWBERRIES.get(), AChickenglowberriesRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENSWEETBERRIES.get(), AChickensweetberriesRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENTINTEDGLASS.get(), AChickentintedglassRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENNETHERITE.get(), AChickennetheriteRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENBEETROOT.get(), AChickenbeetrootRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENSPIDEREYE.get(), AChickenspidereyeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENCARROT.get(), AChickencarrotRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENROTTEN.get(), AChickenrottenRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKENGHASTTEAR.get(), AChickenghasttearRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ALUMINIUM.get(), AChickenAluminiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ZINC.get(), AChickenZincRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SILVER.get(), AChickenSilverRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NICKEL.get(), AChickenNickelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ADAMANTIUM.get(), AChickenAdamantiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BRASS.get(), AChickenBrassRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CHROME.get(), AChickenChromeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ELECTRUM.get(), AChickenElectrumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_INVAR.get(), AChickenInvarRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_IRIDIUM.get(), AChickenIridiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_PLATINUM.get(), AChickenPlatinumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_REFINEDIRON.get(), AChickenRefinedironRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_TITANIUM.get(), AChickenTitaniumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_TUNGSTEN.get(), AChickenTungstenRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_TUNGSTENSTEEL.get(), AChickenTungstensteelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_YELLORIUM.get(), AChickenYelloriumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BLUTONIUM.get(), AChickenBlutoniumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ALLTHEMODIUM.get(), AChickenAllthemodiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_VIBRANIUM.get(), AChickenVibraniumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_UNOBTAINIUM.get(), AChickenUnobtainiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ENDSTONE.get(), AChickenEndstoneRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_COBALD.get(), AChickenCobaldRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_HEPATIZON.get(), AChickenHepatizonRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_KNIGHT_SLIME.get(), AChickenKnightSlimeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_MANYULLYN.get(), AChickenManyullynRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_PIG_IRON.get(), AChickenPigIronRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_QUEEN_SLIME.get(), AChickenQueenSlimeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ROSE_GOLD.get(), AChickenRoseGoldRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SLIMESTEEL.get(), AChickenSlimesteelRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_AMETHYST_BRONZE.get(), AChickenAmethystBronzeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_QUARTZ_ENRICHED_IRON.get(), AChickenQuartzEnrichedIronRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_APATITE.get(), AChickenApatiteRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BASALZ.get(), AChickenBasalzRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BITUMEN.get(), AChickenBitumenRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BLITZ.get(), AChickenBlitzRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_BLIZZ.get(), AChickenBlizzRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CINNABAR.get(), AChickenCinnabarRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_COKE.get(), AChickenCokeRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_CONSTANTAN.get(), AChickenConstantanRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_ENDERIUM.get(), AChickenEnderiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_LUMIUM.get(), AChickenLumiumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_NITER.get(), AChickenNiterRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SAPPHIRE.get(), AChickenSapphireRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_RUBY.get(), AChickenRubyRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SIGNALUM.get(), AChickenSignalumRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_SULFUR.get(), AChickenSulfurRenderer::new);
		event.registerEntityRenderer(ModEntities.A_CHICKEN_TAR.get(), AChickenTarRenderer::new);
		event.registerEntityRenderer(ModEntities.GHOST_CHICKEN.get(), GhostChickenRenderer::new);
	}
}

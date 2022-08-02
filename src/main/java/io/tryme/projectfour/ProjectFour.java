package io.tryme.projectfour;

import io.tryme.projectfour.block.Blocks;
import io.tryme.projectfour.item.Items;
import io.tryme.projectfour.util.ModRegistries;
import io.tryme.projectfour.world.biome.BiomeRegions;
import io.tryme.projectfour.world.biome.BiomeRegistry;
import io.tryme.projectfour.world.biome.OverworldSurfaceRules;
import io.tryme.projectfour.world.gen.feature.TreeConfiguredFeatures;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ProjectFour implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "projectfour";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TreeConfiguredFeatures.registerTreeConfiguredFeatures();

		BiomeRegistry.registerBiomes();

		Blocks.registerModBlocks();
		Items.registerModItems();
		ModRegistries.registerModStuffs();
	}

	@Override
	public void onTerraBlenderInitialized() {
		Regions.register(new BiomeRegions(new Identifier(MOD_ID, "overworld"), 1));

		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, OverworldSurfaceRules.makeRules());
	}
}

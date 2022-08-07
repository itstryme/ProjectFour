package io.tryme.projectfour;

import io.tryme.projectfour.block.Blocks;
import io.tryme.projectfour.item.Items;
import io.tryme.projectfour.mixin.BlockStateProviderMixin;
import io.tryme.projectfour.mixin.TreeDecoratorTypeInvoker;
import io.tryme.projectfour.util.ModRegistries;
import io.tryme.projectfour.world.biome.BiomeRegions;
import io.tryme.projectfour.world.biome.BiomeRegistry;
import io.tryme.projectfour.world.biome.OverworldSurfaceRules;
import io.tryme.projectfour.world.feature.ProjectFourSimpleBlockStateProvider;
import io.tryme.projectfour.world.feature.TreeConfiguredFeatures;

import io.tryme.projectfour.world.feature.tree_decorator.WisteriaVinesTreeDecorator;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ProjectFour implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "projectfour";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final TreeDecoratorType<WisteriaVinesTreeDecorator> WISTERIA_VINES_TREE_DECORATOR =
			TreeDecoratorTypeInvoker.callRegister("wisteria_vines_tree_decorator", WisteriaVinesTreeDecorator.CODEC);
	public static final BlockStateProviderType<ProjectFourSimpleBlockStateProvider> PROJECTFOUR_SIMPLE_BLOCK_STATE_PROVIDER =
			BlockStateProviderMixin.callRegister("hibiscus_simple_block_state_provider", ProjectFourSimpleBlockStateProvider.CODEC);

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

package io.tryme.projectfour.world.feature;

import com.google.common.collect.ImmutableList;
import io.tryme.projectfour.ProjectFour;
import io.tryme.projectfour.block.WisteriaVine;
import io.tryme.projectfour.world.feature.tree_decorator.WisteriaVinesTreeDecorator;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;

import java.util.List;

public class TreeConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE =
            ConfiguredFeatures.register("redwood_tree",
                    Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.REDWOOD_LOG),
                            new GiantTrunkPlacer(13, 2, 14),
                            BlockStateProvider.of(io.tryme.projectfour.block.Blocks.REDWOOD_LEAVES),
                            new MegaPineFoliagePlacer(ConstantIntProvider.create(0),
                                    ConstantIntProvider.create(0),
                                    UniformIntProvider.create(13, 17)),
                            new TwoLayersFeatureSize(1, 1, 2)))
                            .decorators(ImmutableList.of
                                    (new AlterGroundTreeDecorator
                                            (BlockStateProvider.of
                                                    (Blocks.PODZOL))))
                            .build());


    public static final RegistryEntry<ConfiguredFeature <TreeFeatureConfig, ?>> WHITE_WISTERIA_TREE =
            ConfiguredFeatures.register("white_wisteria_tree",
                    Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.WISTERIA_LOG),
                            new ForkingTrunkPlacer(5, 2, 2),
                            BlockStateProvider.of(io.tryme.projectfour.block.Blocks.WHITE_WISTERIA_LEAVES),
                            new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                            new TwoLayersFeatureSize(2, 0, 2))).decorators(List.of(
                                    new WisteriaVinesTreeDecorator(0.45F,
                                    new ProjectFourSimpleBlockStateProvider(io.tryme.projectfour.block.Blocks.WHITE_WISTERIA_VINES_PLANT.getDefaultState()),
                                    new RandomizedIntBlockStateProvider(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.WHITE_WISTERIA_VINES.getDefaultState()), WisteriaVine.AGE, UniformIntProvider.create(22, 25))
                            )
                    )).ignoreVines().build());

    public static final RegistryEntry<ConfiguredFeature <TreeFeatureConfig, ?>> BLUE_WISTERIA_TREE =
            ConfiguredFeatures.register("blue_wisteria_tree",
                    Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.WISTERIA_LOG),
                            new ForkingTrunkPlacer(5, 2, 2),
                            BlockStateProvider.of(io.tryme.projectfour.block.Blocks.BLUE_WISTERIA_LEAVES),
                            new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                            new TwoLayersFeatureSize(2, 0, 2))).decorators(List.of(
                            new WisteriaVinesTreeDecorator(0.45F,
                                    new ProjectFourSimpleBlockStateProvider(io.tryme.projectfour.block.Blocks.BLUE_WISTERIA_VINES_PLANT.getDefaultState()),
                                    new RandomizedIntBlockStateProvider(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.BLUE_WISTERIA_VINES.getDefaultState()), WisteriaVine.AGE, UniformIntProvider.create(22, 25))
                            )
                    )).ignoreVines().build());

    public static final RegistryEntry<ConfiguredFeature <TreeFeatureConfig, ?>> PINK_WISTERIA_TREE =
            ConfiguredFeatures.register("pink_wisteria_tree",
                    Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.WISTERIA_LOG),
                            new ForkingTrunkPlacer(5, 2, 2),
                            BlockStateProvider.of(io.tryme.projectfour.block.Blocks.PINK_WISTERIA_LEAVES),
                            new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                            new TwoLayersFeatureSize(2, 0, 2))).decorators(List.of(
                            new WisteriaVinesTreeDecorator(0.45F,
                                    new ProjectFourSimpleBlockStateProvider(io.tryme.projectfour.block.Blocks.PINK_WISTERIA_VINES_PLANT.getDefaultState()),
                                    new RandomizedIntBlockStateProvider(BlockStateProvider.of(io.tryme.projectfour.block.Blocks.PINK_WISTERIA_VINES.getDefaultState()), WisteriaVine.AGE, UniformIntProvider.create(22, 25))
                            )
                    )).ignoreVines().build());

    public static void registerTreeConfiguredFeatures() {
        System.out.println("Registering Tree Configured Features for " + ProjectFour.MOD_ID);
    }

}

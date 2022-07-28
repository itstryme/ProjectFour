package io.tryme.projectfour.world.gen.feature;

import com.google.common.collect.ImmutableList;
import io.tryme.projectfour.ProjectFour;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;

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

    public static void registerTreeConfiguredFeatures() {
        System.out.println("Registering Tree Configured Features for " + ProjectFour.MOD_ID);
    }

}

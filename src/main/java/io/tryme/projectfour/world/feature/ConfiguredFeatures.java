package io.tryme.projectfour.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DeltaFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class ConfiguredFeatures {
    public static final Feature<DeltaFeatureConfig> PROJECT_FOUR_DELTA_FEATURE =
            Registry.register(Registry.FEATURE, "water_delta_feature", new ProjectFourDeltaFeature(DeltaFeatureConfig.CODEC));

    public static final RegistryEntry<ConfiguredFeature<DeltaFeatureConfig, ?>> WISTERIA_DELTA =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("water_delta", PROJECT_FOUR_DELTA_FEATURE,
                    new DeltaFeatureConfig(Blocks.WATER.getDefaultState(),
                            Blocks.COARSE_DIRT.getDefaultState(),
                            UniformIntProvider.create(4, 8),
                            UniformIntProvider.create(0, 4)));
}

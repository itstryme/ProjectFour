package io.tryme.projectfour.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class VegetationConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> REDWOOD_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("redwood_spawn",
                    Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(
                            new RandomFeatureEntry(TreePlacedFeatures.REDWOOD_CHECKED, 0.1F)),
                            TreePlacedFeatures.REDWOOD_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> WISTERIA_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("white_wisteria_spawn",
                    Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(
                            new RandomFeatureEntry(TreePlacedFeatures.WHITE_WISTERIA_CHECKED, 0.5f),
                            new RandomFeatureEntry(TreePlacedFeatures.BLUE_WISTERIA_CHECKED, 0.5f)),
                            TreePlacedFeatures.PINK_WISTERIA_CHECKED));
}

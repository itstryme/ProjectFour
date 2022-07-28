package io.tryme.projectfour.world.gen.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class VegetationConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> REDWOOD_SPAWN =
            ConfiguredFeatures.register("redwood_spawn",
                    Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(
                            new RandomFeatureEntry(TreePlacedFeatures.REDWOOD_CHECKED, 0.1F)),
                            TreePlacedFeatures.REDWOOD_CHECKED));
}

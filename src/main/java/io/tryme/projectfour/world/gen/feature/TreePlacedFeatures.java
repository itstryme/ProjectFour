package io.tryme.projectfour.world.gen.feature;

import io.tryme.projectfour.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class TreePlacedFeatures {
    public static final RegistryEntry<PlacedFeature> REDWOOD_CHECKED =
            PlacedFeatures.register("redwood_checked", TreeConfiguredFeatures.REDWOOD_TREE,
                    PlacedFeatures.wouldSurvive(Blocks.REDWOOD_SAPLING));
}

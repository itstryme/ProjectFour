package io.tryme.projectfour.world.feature;

import com.sun.source.tree.Tree;
import io.tryme.projectfour.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class TreePlacedFeatures {
    public static final RegistryEntry<PlacedFeature> REDWOOD_CHECKED =
            PlacedFeatures.register("redwood_checked", TreeConfiguredFeatures.REDWOOD_TREE,
                    PlacedFeatures.wouldSurvive(Blocks.REDWOOD_SAPLING));

    public static final RegistryEntry<PlacedFeature> WHITE_WISTERIA_CHECKED =
            PlacedFeatures.register("white_wisteria_checked", TreeConfiguredFeatures.WHITE_WISTERIA_TREE,
                    PlacedFeatures.wouldSurvive(Blocks.WHITE_WISTERIA_SAPLING));

    public static final RegistryEntry<PlacedFeature> BLUE_WISTERIA_CHECKED =
            PlacedFeatures.register("blue_wisteria_checked", TreeConfiguredFeatures.BLUE_WISTERIA_TREE,
                    PlacedFeatures.wouldSurvive(Blocks.BLUE_WISTERIA_SAPLING));

    public static final RegistryEntry<PlacedFeature> PINK_WISTERIA_CHECKED =
            PlacedFeatures.register("pink_wisteria_checked", TreeConfiguredFeatures.PINK_WISTERIA_TREE,
                    PlacedFeatures.wouldSurvive(Blocks.PINK_WISTERIA_SAPLING));
}

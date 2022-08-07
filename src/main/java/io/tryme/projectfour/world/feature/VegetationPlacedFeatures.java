package io.tryme.projectfour.world.feature;

import io.tryme.projectfour.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class VegetationPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> REDWOOD_PLACED =
            PlacedFeatures.register("trees_redwood",
                    VegetationConfiguredFeatures.REDWOOD_SPAWN,
                    net.minecraft.world.gen.feature.VegetationPlacedFeatures.modifiersWithWouldSurvive(
                            PlacedFeatures.createCountExtraModifier(10, 0.1F, 1),
                            Blocks.REDWOOD_SAPLING));

    public static final RegistryEntry<PlacedFeature> WISTERIA_PLACED =
            PlacedFeatures.register("trees_white_wisteria",
                    VegetationConfiguredFeatures.WISTERIA_SPAWN,
                    net.minecraft.world.gen.feature.VegetationPlacedFeatures.modifiers(
                            PlacedFeatures.createCountExtraModifier(6, 0.5f, 7)));
}

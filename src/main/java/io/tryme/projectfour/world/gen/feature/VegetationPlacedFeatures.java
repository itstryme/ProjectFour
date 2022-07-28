package io.tryme.projectfour.world.gen.feature;

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
}

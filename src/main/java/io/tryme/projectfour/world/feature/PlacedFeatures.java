package io.tryme.projectfour.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountMultilayerPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

public class PlacedFeatures {
    public static final RegistryEntry<PlacedFeature> WISTERIA_WATER =
            net.minecraft.world.gen.feature.PlacedFeatures.register("wisteria_water",
                    ConfiguredFeatures.WISTERIA_DELTA,
                    new PlacementModifier[]{CountMultilayerPlacementModifier.of(20),
                            BiomePlacementModifier.of()});
}

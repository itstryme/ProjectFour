package io.tryme.projectfour.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class BiomeRegions extends Region {
    public BiomeRegions(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiome(mapper,
                ParameterUtils.Temperature.NEUTRAL,
                ParameterUtils.Humidity.NEUTRAL,
                ParameterUtils.Continentalness.MID_INLAND,
                ParameterUtils.Erosion.EROSION_0,
                ParameterUtils.Weirdness.VALLEY,
                ParameterUtils.Depth.SURFACE,
                0,
                BiomeKeys.REDWOOD_FOREST);

    }
}

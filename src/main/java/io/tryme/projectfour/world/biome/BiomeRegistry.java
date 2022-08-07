package io.tryme.projectfour.world.biome;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class BiomeRegistry {

    public static void registerBiomes() {
        register(BiomeKeys.REDWOOD_FOREST, OverworldBiomeCreator.createRedwoodForest());
        register(BiomeKeys.WISTERIA_FOREST, OverworldBiomeCreator.createWisteriaForest());
    }

    private static void register(RegistryKey<Biome> key, Biome biome)
    {
        BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}

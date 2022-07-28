package io.tryme.projectfour.world.biome;

import io.tryme.projectfour.ProjectFour;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

/*
First step:
Register all keys of the biome
 */
public class BiomeKeys {

    public static final RegistryKey<Biome> REDWOOD_FOREST = register("redwood_forest");

    private static RegistryKey<Biome> register(String name)
    {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(ProjectFour.MOD_ID, name));
    }
}

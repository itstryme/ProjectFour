package io.tryme.projectfour.world.biome;

import io.tryme.projectfour.world.gen.feature.ModBiomeFeatures;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import javax.annotation.Nullable;

public class OverworldBiomeCreator {
    @Nullable
    private static final MusicSound NORMAL_MUSIC = null;

    protected static int calculateSkyColor(float color)
    {
        float $$1 = color / 3.0F;
        $$1 = MathHelper.clamp($$1, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static Biome createBiome(Biome.Precipitation precipitation,
                                     float temperature,
                                     float downfall,
                                     SpawnSettings.Builder spawnSettings,
                                     net.minecraft.world.biome.GenerationSettings.Builder generationSettings,
                                     @org.jetbrains.annotations.Nullable MusicSound music) {
        return createBiome(precipitation,
                temperature,
                downfall,
                4159204,
                329011,
                spawnSettings,
                generationSettings,
                music);
    }

    private static Biome createBiome(Biome.Precipitation precipitation,
                                     float temperature,
                                     float downfall,
                                     int waterColor,
                                     int waterFogColor,
                                     SpawnSettings.Builder spawnSettings,
                                     net.minecraft.world.biome.GenerationSettings.Builder generationSettings,
                                     @org.jetbrains.annotations.Nullable MusicSound music) {

        return (new net.minecraft.world.biome.Biome.Builder())
                .precipitation(precipitation)
                .temperature(temperature)
                .downfall(downfall)
                .effects((new net.minecraft.world.biome.BiomeEffects.Builder())
                        .waterColor(waterColor).waterFogColor(waterFogColor)
                        .fogColor(12638463).skyColor(calculateSkyColor(temperature))
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(music).build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }

    public static Biome createRedwoodForest() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        ModBiomeFeatures.addRedWoodMobs(spawnBuilder);

        GenerationSettings.Builder generationBuilder = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addForestGrass(generationBuilder);
        ModBiomeFeatures.addRedwoodTrees(generationBuilder);

        return createBiome(Biome.Precipitation.RAIN, 0.7f, 0.8F, spawnBuilder, generationBuilder, NORMAL_MUSIC);
    }
}

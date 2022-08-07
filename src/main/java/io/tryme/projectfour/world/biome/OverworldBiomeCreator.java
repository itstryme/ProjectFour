package io.tryme.projectfour.world.biome;

import io.tryme.projectfour.world.feature.ConfiguredFeatures;
import io.tryme.projectfour.world.feature.ModBiomeFeatures;
import io.tryme.projectfour.world.feature.PlacedFeatures;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

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

    private static void globalOverworldGeneration(GenerationSettings.Builder builder)
    {
        DefaultBiomeFeatures.addLandCarvers(builder);
//        DefaultBiomeFeatures.addAmethystGeodes(builder);
//        DefaultBiomeFeatures.addDungeons(builder);
//        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
    }

    public static Biome createRedwoodForest() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        ModBiomeFeatures.addRedWoodMobs(spawnBuilder);

        GenerationSettings.Builder generationBuilder = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addForestGrass(generationBuilder);
        ModBiomeFeatures.addRedwoodTrees(generationBuilder);

        return createBiome(Biome.Precipitation.RAIN, 0.7f, 0.8F, spawnBuilder, generationBuilder, NORMAL_MUSIC);
    }

    public static Biome createWisteriaForest() {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addJungleMobs(spawnBuilder);

        GenerationSettings.Builder generationBuilder = new GenerationSettings.Builder().feature(GenerationStep.Feature.FLUID_SPRINGS, PlacedFeatures.WISTERIA_WATER);

        ModBiomeFeatures.addWisteriaTrees(generationBuilder);
        DefaultBiomeFeatures.addDefaultOres(generationBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(generationBuilder);
        DefaultBiomeFeatures.addDefaultDisks(generationBuilder);
        DefaultBiomeFeatures.addExtraDefaultFlowers(generationBuilder);
        globalOverworldGeneration(generationBuilder);
        generationBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_WATERLILY);

        return createBiome(Biome.Precipitation.RAIN, 0.4F, 0.9F, spawnBuilder, generationBuilder, NORMAL_MUSIC);
    }
}

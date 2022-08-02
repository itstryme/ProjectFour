package io.tryme.projectfour.util;

import io.tryme.projectfour.block.Blocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFlammableBlock();
        registerStrippables();
    }

    private static void registerFlammableBlock() {

        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(Blocks.REDWOOD_LOG, 5, 5);
        instance.add(Blocks.REDWOOD_WOOD, 5, 5);
        instance.add(Blocks.STRIPPED_REDWOOD_LOG, 5, 5);
        instance.add(Blocks.STRIPPED_REDWOOD_WOOD, 5, 5);
        instance.add(Blocks.REDWOOD_PLANKS, 5, 20);
        instance.add(Blocks.REDWOOD_LEAVES, 30, 60);

        instance.add(Blocks.WISTERIA_LOG, 5, 5);
        instance.add(Blocks.WISTERIA_WOOD, 5, 5);
        instance.add(Blocks.STRIPPED_WISTERIA_LOG, 5, 5);
        instance.add(Blocks.STRIPPED_WISTERIA_WOOD, 5, 5);
        instance.add(Blocks.WISTERIA_PLANKS, 5, 20);
        instance.add(Blocks.WHITE_WISTERIA_LEAVES, 30, 60);
        instance.add(Blocks.BLUE_WISTERIA_LEAVES, 30, 60);
        instance.add(Blocks.PINK_WISTERIA_LEAVES, 30, 60);

    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(Blocks.REDWOOD_LOG, Blocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(Blocks.REDWOOD_WOOD, Blocks.STRIPPED_REDWOOD_WOOD);

        StrippableBlockRegistry.register(Blocks.WISTERIA_LOG, Blocks.STRIPPED_WISTERIA_LOG);
        StrippableBlockRegistry.register(Blocks.WISTERIA_WOOD, Blocks.STRIPPED_WISTERIA_WOOD);
    }
}

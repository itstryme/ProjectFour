package io.tryme.projectfour.block;

import io.tryme.projectfour.ProjectFour;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_LEAVES)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_LOG)),
            ItemGroup.MISC);

    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_WOOD)),
            ItemGroup.MISC);

    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STRIPPED_OAK_LOG)),
            ItemGroup.MISC);

    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STRIPPED_OAK_WOOD)),
            ItemGroup.MISC);

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_PLANKS)),
            ItemGroup.MISC);

    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ProjectFour.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectFour.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        ProjectFour.LOGGER.debug("registering mod blocks for " + ProjectFour.MOD_ID);
    }
}

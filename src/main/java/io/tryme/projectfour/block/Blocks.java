package io.tryme.projectfour.block;

import io.tryme.projectfour.ProjectFour;
import io.tryme.projectfour.block.entity.SignTypes;
import io.tryme.projectfour.block.sapling.BlueWisteriaSaplingGenerator;
import io.tryme.projectfour.block.sapling.PinkWisteriaSaplingGenerator;
import io.tryme.projectfour.block.sapling.RedwoodSaplingGenerator;

import io.tryme.projectfour.block.sapling.WhiteWisteriaSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {


    // Redwood
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

    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new SaplingBlock(new RedwoodSaplingGenerator(), FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_SAPLING)),
            ItemGroup.MISC);

    public static final Block REDWOOD_BUTTON = registerBlock("redwood_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD)
                    .noCollision()
                    .requiresTool()
                    .strength(0.5f, 0.5f)),
            ItemGroup.MISC);

    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.WOOD)
                            .strength(0.5f, 0.5f)
                            .requiresTool()),
            ItemGroup.MISC);

    public static final Block REDWOOD_FENCE = registerBlock("redwood_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD)
                    .hardness(2f)
                    .resistance(3f)
                    .requiresTool()),
            ItemGroup.MISC);

    public static final Block REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD)
                    .hardness(2f)
                    .resistance(3f)
                    .requiresTool()),
            ItemGroup.MISC);

    public static final Block REDWOOD_SLAB = registerBlock("redwood_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)),
            ItemGroup.MISC);

    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs",
            new StairsBlock(REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)),
            ItemGroup.MISC);

    public static final Block REDWOOD_DOOR = registerBlock("redwood_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)),
            ItemGroup.MISC);

    public static final Block REDWOOD_WALL_SIGN_BLOCK = registerWithoutBlockItem("redwood_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.OAK_WALL_SIGN), SignTypes.REDWOOD));

    public static final Block REDWOOD_SIGN_BLOCK = registerWithoutBlockItem("redwood_sign",
            new SignBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.OAK_SIGN), SignTypes.REDWOOD));


    // Wisteria
    public static final Block WHITE_WISTERIA_LEAVES = registerBlock("white_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_LEAVES)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block BLUE_WISTERIA_LEAVES = registerBlock("blue_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_LEAVES)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block PINK_WISTERIA_LEAVES = registerBlock("pink_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_LEAVES)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block WISTERIA_LOG = registerBlock("wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_LOG)),
            ItemGroup.MISC);

    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_WOOD)),
            ItemGroup.MISC);

    public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STRIPPED_OAK_LOG)),
            ItemGroup.MISC);

    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STRIPPED_OAK_WOOD)),
            ItemGroup.MISC);

    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks",
            new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_PLANKS)),
            ItemGroup.MISC);

    public static final Block WISTERIA_BUTTON = registerBlock("wisteria_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD)
                    .noCollision()
                    .requiresTool()
                    .strength(0.5f, 0.5f)),
            ItemGroup.MISC);

    public static final Block WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.WOOD)
                            .strength(0.5f, 0.5f)
                            .requiresTool()),
            ItemGroup.MISC);

    public static final Block WISTERIA_FENCE = registerBlock("wisteria_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD)
                    .hardness(2f)
                    .resistance(3f)
                    .requiresTool()),
            ItemGroup.MISC);

    public static final Block WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD)
                    .hardness(2f)
                    .resistance(3f)
                    .requiresTool()),
            ItemGroup.MISC);

    public static final Block WISTERIA_SLAB = registerBlock("wisteria_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)),
            ItemGroup.MISC);

    public static final Block WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            new StairsBlock(REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)),
            ItemGroup.MISC);

    public static final Block WISTERIA_DOOR = registerBlock("wisteria_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block WISTERIA_TRAPDOOR = registerBlock("wisteria_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .requiresTool()
                    .strength(2f)
                    .resistance(3f)
                    .nonOpaque()),
            ItemGroup.MISC);

    public static final Block WISTERIA_WALL_SIGN_BLOCK = registerWithoutBlockItem("wisteria_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.OAK_WALL_SIGN), SignTypes.WISTERIA));

    public static final Block WISTERIA_SIGN_BLOCK = registerWithoutBlockItem("wisteria_sign",
            new SignBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.OAK_SIGN), SignTypes.WISTERIA));

    public static final Block PINK_WISTERIA_VINES = registerBlock("pink_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.of(Material.PLANT, MapColor.PINK)
                    .ticksRandomly()
                    .noCollision()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.WEEPING_VINES)),
            ItemGroup.MISC);
    public static final Block PINK_WISTERIA_VINES_PLANT = registerWithoutBlockItem("pink_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.of(Material.PLANT, MapColor.PINK)
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.WEEPING_VINES)
                    .dropsLike(PINK_WISTERIA_VINES)));

    public static final Block WHITE_WISTERIA_VINES = registerBlock("white_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.of(Material.PLANT, MapColor.PINK)
                    .ticksRandomly()
                    .noCollision()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.WEEPING_VINES)),
            ItemGroup.MISC);
    public static final Block WHITE_WISTERIA_VINES_PLANT = registerWithoutBlockItem("white_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.of(Material.PLANT, MapColor.PINK)
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.WEEPING_VINES)
                    .dropsLike(WHITE_WISTERIA_VINES)));

    public static final Block BLUE_WISTERIA_VINES = registerBlock("blue_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.of(Material.PLANT, MapColor.PINK)
                    .ticksRandomly()
                    .noCollision()
                    .breakInstantly()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.WEEPING_VINES)),
            ItemGroup.MISC);
    public static final Block BLUE_WISTERIA_VINES_PLANT = registerWithoutBlockItem("blue_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.of(Material.PLANT, MapColor.PINK)
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.WEEPING_VINES)
                    .dropsLike(BLUE_WISTERIA_VINES)));

    public static final Block WHITE_WISTERIA_SAPLING = registerBlock("white_wisteria_sapling",
            new SaplingBlock(new WhiteWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_SAPLING)),
            ItemGroup.MISC);

    public static final Block BLUE_WISTERIA_SAPLING = registerBlock("blue_wisteria_sapling",
            new SaplingBlock(new BlueWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_SAPLING)),
            ItemGroup.MISC);

    public static final Block PINK_WISTERIA_SAPLING = registerBlock("pink_wisteria_sapling",
            new SaplingBlock(new PinkWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_SAPLING)),
            ItemGroup.MISC);



    // Registry Methods
    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ProjectFour.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectFour.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static Block registerWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ProjectFour.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        ProjectFour.LOGGER.debug("registering mod blocks for " + ProjectFour.MOD_ID);
    }
}

package io.tryme.projectfour.item;

import io.tryme.projectfour.ProjectFour;
import io.tryme.projectfour.block.Blocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item REDWOOD_SIGN = registerItem("redwood_sign",
            new SignItem(new FabricItemSettings()
                    .group(ItemGroup.MISC)
                    .maxCount(16),
                    Blocks.REDWOOD_SIGN_BLOCK,
                    Blocks.REDWOOD_WALL_SIGN_BLOCK));

    public static final Item WISTERIA_SIGN = registerItem("wisteria_sign",
            new SignItem(new FabricItemSettings()
                    .group(ItemGroup.MISC)
                    .maxCount(16),
                    Blocks.WISTERIA_SIGN_BLOCK,
                    Blocks.WISTERIA_WALL_SIGN_BLOCK));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectFour.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProjectFour.LOGGER.debug("registering mod items for " + ProjectFour.MOD_ID);
    }
}

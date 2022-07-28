package io.tryme.projectfour.item;

import io.tryme.projectfour.ProjectFour;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectFour.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProjectFour.LOGGER.debug("registering mod items for " + ProjectFour.MOD_ID);
    }
}

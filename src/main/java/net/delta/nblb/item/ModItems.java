package net.delta.nblb.item;

import net.delta.nblb.NBLB;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NBLB.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NBLB.LOGGER.info("Registering Mod Items for " + NBLB.MOD_ID);
    }
}

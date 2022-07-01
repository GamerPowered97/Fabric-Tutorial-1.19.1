package net.gamerpowered97.jadepearl.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gamerpowered97.jadepearl.JadePearl;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_JADE = registerItem("raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroup.JADE_PEARL)));
    public static final Item JADE_PEARL = registerItem("jade_pearl",
            new Item(new FabricItemSettings().group(ModItemGroup.JADE_PEARL)));
    public static final Item JADE_INGOT = registerItem("jade_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.JADE_PEARL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JadePearl.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        JadePearl.LOGGER.debug("Registering Mod Items for" + JadePearl.MOD_ID);
    }
}

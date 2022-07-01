package net.gamerpowered97.jadepearl.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gamerpowered97.jadepearl.JadePearl;
import net.gamerpowered97.jadepearl.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                UniformIntProvider.create(4, 7)));
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                UniformIntProvider.create(3, 6)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(JadePearl.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(JadePearl.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.JADE_PEARL)));
    }

    public static void registerModBlocks() {
        JadePearl.LOGGER.debug("Registering ModBlocks for " + JadePearl.MOD_ID);
    }
}

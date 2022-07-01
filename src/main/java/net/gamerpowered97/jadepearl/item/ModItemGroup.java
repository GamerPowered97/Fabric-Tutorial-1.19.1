package net.gamerpowered97.jadepearl.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gamerpowered97.jadepearl.JadePearl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup JADE_PEARL = FabricItemGroupBuilder.build(
            new Identifier(JadePearl.MOD_ID, "jade_pearl"), () -> new ItemStack(ModItems.JADE_PEARL));
}

package io.github.yummyfood.api.register;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface BlocksRegister {
    static void registerBlock(String modid, String blockName, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
    }

    static void registerItemBlock(String modid, String blockName, Block block, Item.Settings settings) {
        Registry.register(Registry.ITEM, new Identifier(modid, blockName), new BlockItem(block, settings));
    }
}

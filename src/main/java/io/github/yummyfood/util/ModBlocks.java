package io.github.yummyfood.util;

import io.github.yummyfood.YummyFood;
import io.github.yummyfood.api.register.BlocksRegister;
import io.github.yummyfood.blocks.PineappleBlock;
import io.github.yummyfood.itemGroup.ItemGroups;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;

public class ModBlocks {
    private static final String MODID = YummyFood.MODID;

    public static final Block PINEAPPLE_BLOCK = new PineappleBlock(FabricBlockSettings.of(Material.METAL).build());

    public ModBlocks() {
        registerBlock("pineapple_block", PINEAPPLE_BLOCK);

        registerItemBlock("pineapple_block", PINEAPPLE_BLOCK, new Item.Settings().group(ItemGroups.BLOCK_GROUP));
    }

    private static void registerBlock(String blockName, Block block) {
        BlocksRegister.registerBlock(MODID, blockName, block);
    }

    private static void registerItemBlock(String blockName, Block block, Item.Settings settings) {
        BlocksRegister.registerItemBlock(MODID, blockName, block, settings);
    }
}

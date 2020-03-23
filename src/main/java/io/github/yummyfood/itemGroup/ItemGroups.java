package io.github.yummyfood.itemGroup;

import io.github.yummyfood.YummyFood;
import io.github.yummyfood.util.ModBlocks;
import io.github.yummyfood.util.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
    private static final String MODID = YummyFood.MODID;

    public static final ItemGroup FOOD_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MODID, "food_group"))
            .icon(() -> new ItemStack(ModItems.PINEAPPLE))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(ModItems.PINEAPPLE));

            })
            .build();

    public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MODID, "block_group"))
            .icon(() -> new ItemStack(ModBlocks.PINEAPPLE_BLOCK))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(ModBlocks.PINEAPPLE_BLOCK));

            })
            .build();

}

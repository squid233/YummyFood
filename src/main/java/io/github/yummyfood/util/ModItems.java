package io.github.yummyfood.util;

import io.github.yummyfood.YummyFood;
import io.github.yummyfood.api.register.ItemsRegister;
import io.github.yummyfood.items.Pineapple;
import net.minecraft.item.Item;

public class ModItems {
    private static final String MODID = YummyFood.MODID;

    public static final Item PINEAPPLE = new Pineapple();

    public ModItems() {
        registerItem("pineapple", PINEAPPLE);
    }

    private static void registerItem(String itemName, Item item) {
        ItemsRegister.registerItem(MODID, itemName, item);
    }

}

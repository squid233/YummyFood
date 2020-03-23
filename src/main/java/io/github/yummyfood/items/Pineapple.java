package io.github.yummyfood.items;

import io.github.yummyfood.itemGroup.ItemGroups;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Pineapple extends Item {
    static FoodComponent.Builder food = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).alwaysEdible();

    public Pineapple() {
        super(
                new Settings()
                .group(ItemGroups.FOOD_GROUP)
                .food(food.build())
        );
    }

}

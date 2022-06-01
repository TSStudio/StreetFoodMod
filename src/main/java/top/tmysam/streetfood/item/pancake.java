package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class pancake extends Item {
    public pancake(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(7).saturationModifier(5F).build()));
    }
}

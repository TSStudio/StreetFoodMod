package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class rawPancake extends Item {
    public rawPancake(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(4).saturationModifier(1F).build()));
    }
}


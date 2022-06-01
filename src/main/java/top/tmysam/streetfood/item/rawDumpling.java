package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class rawDumpling extends Item {
    public rawDumpling(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(4).saturationModifier(1F).build()));
    }
}

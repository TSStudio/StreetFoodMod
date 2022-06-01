package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class dumpling extends Item {
    public dumpling(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(7).saturationModifier(4F).build()));
    }
}

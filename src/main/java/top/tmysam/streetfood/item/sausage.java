package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class sausage extends Item {
    public sausage(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(6).saturationModifier(3F).build()));
    }
}

package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class rawSausage extends Item{
    public rawSausage(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(4).saturationModifier(2F).build()));
    }
}

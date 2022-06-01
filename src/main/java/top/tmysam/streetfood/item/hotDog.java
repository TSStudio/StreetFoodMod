package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class hotDog extends Item {
    public hotDog(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(9).saturationModifier(6F).build()));
    }
}


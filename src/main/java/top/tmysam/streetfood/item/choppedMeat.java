package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class choppedMeat extends Item {
    public choppedMeat(Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(3).saturationModifier(1F).build()));
    }
}

package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class rawStuffenedBun extends Item {
    public rawStuffenedBun(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(5).saturationModifier(1F).build()));
    }
}


package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class stuffenedBun extends Item {
    public stuffenedBun(Item.Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(8).saturationModifier(4F).build()));
    }
}

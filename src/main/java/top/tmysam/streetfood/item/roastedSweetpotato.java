package top.tmysam.streetfood.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class roastedSweetpotato extends Item {
    public roastedSweetpotato(Settings settings) {
        super(settings.food((new FoodComponent.Builder()).hunger(5).saturationModifier(4F).build()));
    }
}

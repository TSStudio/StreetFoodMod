package top.tmysam.streetfood.item;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import top.tmysam.streetfood.blockInitializer;

public class sweetpotato extends AliasedBlockItem {
    public sweetpotato(Settings settings) {
        super(blockInitializer.sweetPotatoBlock,settings.food((new FoodComponent.Builder()).hunger(1).saturationModifier(0.6F).build()));
    }
}

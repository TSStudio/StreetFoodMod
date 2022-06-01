package top.tmysam.streetfood;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.tmysam.streetfood.item.*;

public class itemInitializer {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("streetfood", "streetfood"),
            () -> new ItemStack(itemInitializer.sweetPotato));

    public static final Item sweetPotato = new sweetpotato(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item roastedSweetPotato = new roastedSweetpotato(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item choppedMeat = new choppedMeat(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item flour = new flour(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item dough = new dough(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item rawSausage = new rawSausage(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item sausage = new sausage(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item cookedSausage = new cookedSausage(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item crust = new crust(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item dumpling = new dumpling(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item dumplingSkin = new dumplingSkin(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item hotDog = new hotDog(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item pancake = new pancake(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item rawDumpling = new rawDumpling(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item rawPancake = new rawPancake(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item rawStuffenedBun = new rawStuffenedBun(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item stuffenedBun = new stuffenedBun(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item stuffenedBunSkin = new stuffenedBunSkin(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("streetfood", "sweet_potato"), sweetPotato);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "roasted_sweet_potato"), roastedSweetPotato);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "chopped_meat"), choppedMeat);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "flour"), flour);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "dough"), dough);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "raw_sausage"), rawSausage);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "sausage"), sausage);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "cooked_sausage"), cookedSausage);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "crust"), crust);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "dumpling"), dumpling);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "dumpling_skin"), dumplingSkin);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "hot_dog"), hotDog);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "pancake"), pancake);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "raw_dumpling"), rawDumpling);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "raw_pancake"), rawPancake);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "raw_stuffened_bun"), rawStuffenedBun);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "stuffened_bun"), stuffenedBun);
        Registry.register(Registry.ITEM, new Identifier("streetfood", "stuffened_bun_skin"), stuffenedBunSkin);
    }
}

package top.tmysam.streetfood;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.util.Identifier;

public class lootInitializer {
    private static final Identifier GrassLootTable = new Identifier("minecraft","blocks/grass");
    private static final Identifier GrassLootTableAttach = new Identifier("streetfood","blocks/grass");
    public static void init(){
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if(id.equals(GrassLootTable)){
                // Attach
                FabricLootPoolBuilder builder= FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(GrassLootTableAttach));
                supplier.withPool(builder.build());
            }
        }));
    }
}

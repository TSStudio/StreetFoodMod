package top.tmysam.streetfood;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.tmysam.streetfood.block.sweetPotatoBlock;

public class blockInitializer {
    public static final CropBlock sweetPotatoBlock=new sweetPotatoBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static void init(){
        Registry.register(Registry.BLOCK, new Identifier("streetfood","sweet_potato_block"), sweetPotatoBlock);
    }
}

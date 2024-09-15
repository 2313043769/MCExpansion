package com.myvillager.util;

import com.myvillager.MyVillageMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

//    为方块定义标签
    public static class Blocks{
//        金属探测器检测标签
        public static final TagKey<Block> metal_detector_detectable_blocks =
                createTag("metal_detector_detectable_blocks");
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK,new Identifier(MyVillageMod.MOD_ID,name));
        }
    }
//    为物品定义标签
    private static class Items{
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM,new Identifier(MyVillageMod.MOD_ID,name));
        }
    }
}

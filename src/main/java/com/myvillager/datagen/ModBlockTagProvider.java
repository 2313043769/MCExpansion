package com.myvillager.datagen;

import com.myvillager.block.ModBlocks;
import com.myvillager.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        木头类
//        getOrCreateTagBuilder(BlockTags.LOGS)
//                .add(ModBlocks.RED_MAPLE_LOG)
//                .add(ModBlocks.RED_MAPLE_WOOD)
//                .add(ModBlocks.STRIPPED_RED_MAPLE_LOG)
//                .add(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
//        可被检测的方块
//        getOrCreateTagBuilder(ModTags.Blocks.metal_detector_detectable_blocks)
//                .add(ModBlocks.silver_block)
//                .forceAddTag(BlockTags.GOLD_ORES)
//                .forceAddTag(BlockTags.IRON_ORES)
//                .forceAddTag(BlockTags.COAL_ORES)
//                .forceAddTag(BlockTags.DIAMOND_ORES)
//                .forceAddTag(BlockTags.LAPIS_ORES)
//                .forceAddTag(BlockTags.REDSTONE_ORES)
//                .forceAddTag(BlockTags.EMERALD_ORES)
//                .forceAddTag(BlockTags.COPPER_ORES);


//        使方块可挖掘
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

//                铜
                .add(ModBlocks.copper_pressure_plate)
                .add(ModBlocks.copper_button)
                .add(ModBlocks.copper_stairs)
                .add(ModBlocks.copper_door)
                .add(ModBlocks.copper_fence_gate)
                .add(ModBlocks.copper_fence)
                .add(ModBlocks.copper_wall)
                .add(ModBlocks.copper_slab)
                .add(ModBlocks.copper_trapdoor)

                //                铁
                .add(ModBlocks.iron_button)
                .add(ModBlocks.iron_stairs)
                .add(ModBlocks.iron_fence_gate)
                .add(ModBlocks.iron_fence)
                .add(ModBlocks.iron_wall)
                .add(ModBlocks.iron_slab)
//        黄金
                .add(ModBlocks.gold_button)
                .add(ModBlocks.gold_stairs)
                .add(ModBlocks.gold_door)
                .add(ModBlocks.gold_fence_gate)
                .add(ModBlocks.gold_fence)
                .add(ModBlocks.gold_wall)
                .add(ModBlocks.gold_slab)
                .add(ModBlocks.gold_trapdoor)

//                        钻石
                .add(ModBlocks.diamond_pressure_plate)
                .add(ModBlocks.diamond_button)
                .add(ModBlocks.diamond_stairs)
                .add(ModBlocks.diamond_door)
                .add(ModBlocks.diamond_fence_gate)
                .add(ModBlocks.diamond_fence)
                .add(ModBlocks.diamond_wall)
                .add(ModBlocks.diamond_slab)
                .add(ModBlocks.diamond_trapdoor)

//                        绿宝石
                .add(ModBlocks.emerald_pressure_plate)
                .add(ModBlocks.emerald_button)
                .add(ModBlocks.emerald_stairs)
                .add(ModBlocks.emerald_door)
                .add(ModBlocks.emerald_fence_gate)
                .add(ModBlocks.emerald_fence)
                .add(ModBlocks.emerald_wall)
                .add(ModBlocks.emerald_slab)
                .add(ModBlocks.emerald_trapdoor)

//                        红宝石
                .add(ModBlocks.ruby_block)
                .add(ModBlocks.ruby_pressure_plate)
                .add(ModBlocks.ruby_button)
                .add(ModBlocks.ruby_stairs)
                .add(ModBlocks.ruby_fence_gate)
                .add(ModBlocks.ruby_fence)
                .add(ModBlocks.ruby_wall)
                .add(ModBlocks.ruby_slab);



//                .add(ModBlocks.ruby_ore)
//                .add(ModBlocks.deepslate_ruby_ore)
//                .add(ModBlocks.adamas_block)
//                .add(ModBlocks.adamas_ore)
//                .add(ModBlocks.deepslate_adamas_ore)
//                .add(ModBlocks.nether_adamas_ore)
//                .add(ModBlocks.end_adamas_ore)
//                .add(ModBlocks.silver_ore)
//                .add(ModBlocks.silver_block)
//                .add(ModBlocks.deepslate_silver_ore)
//                .add(ModBlocks.nether_silver_ore)
//                .add(ModBlocks.end_silver_ore)
//                .add(ModBlocks.sound_block)
//                .add(ModBlocks.adamas_pressure_plate)
//                .add(ModBlocks.adamas_button)
//                .add(ModBlocks.adamas_stairs)
//                .add(ModBlocks.adamas_door)
//                .add(ModBlocks.adamas_fence_gate)
//                .add(ModBlocks.adamas_fence)
//                .add(ModBlocks.adamas_wall)
//                .add(ModBlocks.adamas_slab)
//                .add(ModBlocks.adamas_trapdoor);




//        具体能被哪些工具挖掘
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//                .add(ModBlocks.silver_ore)
//                .add(ModBlocks.silver_block)
//                .add(ModBlocks.deepslate_silver_ore)
//                .add(ModBlocks.nether_silver_ore)
//                .add(ModBlocks.end_silver_ore)
//                .add(ModBlocks.sound_block)
//

//                铜
                .add(ModBlocks.copper_pressure_plate)
                .add(ModBlocks.copper_button)
                .add(ModBlocks.copper_stairs)
                .add(ModBlocks.copper_door)
                .add(ModBlocks.copper_fence_gate)
                .add(ModBlocks.copper_fence)
                .add(ModBlocks.copper_wall)
                .add(ModBlocks.copper_slab)
                .add(ModBlocks.copper_trapdoor);





        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ruby_block)

//                铁
                .add(ModBlocks.iron_button)
                .add(ModBlocks.iron_stairs)
                .add(ModBlocks.iron_fence_gate)
                .add(ModBlocks.iron_fence)
                .add(ModBlocks.iron_wall)
                .add(ModBlocks.iron_slab)
//        黄金
                .add(ModBlocks.gold_button)
                .add(ModBlocks.gold_stairs)
                .add(ModBlocks.gold_door)
                .add(ModBlocks.gold_fence_gate)
                .add(ModBlocks.gold_fence)
                .add(ModBlocks.gold_wall)
                .add(ModBlocks.gold_slab)
                .add(ModBlocks.gold_trapdoor)

//                        钻石
                .add(ModBlocks.diamond_pressure_plate)
                .add(ModBlocks.diamond_button)
                .add(ModBlocks.diamond_stairs)
                .add(ModBlocks.diamond_door)
                .add(ModBlocks.diamond_fence_gate)
                .add(ModBlocks.diamond_fence)
                .add(ModBlocks.diamond_wall)
                .add(ModBlocks.diamond_slab)
                .add(ModBlocks.diamond_trapdoor)

//                        绿宝石
                .add(ModBlocks.emerald_pressure_plate)
                .add(ModBlocks.emerald_button)
                .add(ModBlocks.emerald_stairs)
                .add(ModBlocks.emerald_door)
                .add(ModBlocks.emerald_fence_gate)
                .add(ModBlocks.emerald_fence)
                .add(ModBlocks.emerald_wall)
                .add(ModBlocks.emerald_slab)
                .add(ModBlocks.emerald_trapdoor)


//                        红宝石
                .add(ModBlocks.ruby_block)
                .add(ModBlocks.ruby_pressure_plate)
                .add(ModBlocks.ruby_button)
                .add(ModBlocks.ruby_stairs)
                .add(ModBlocks.ruby_fence_gate)
                .add(ModBlocks.ruby_fence)
                .add(ModBlocks.ruby_wall)
                .add(ModBlocks.ruby_slab);





//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK,new Identifier("fabric","needs_tool_level_4")))
//                .add(ModBlocks.end_silver_ore)
//                .add(ModBlocks.end_adamas_ore);


//        给予栅栏、栅栏门、围墙等标签，防止互相不连接

//        铜
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.copper_fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.copper_fence_gate);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.copper_wall);

        //        铁
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.iron_fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.iron_fence_gate);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.iron_wall);

        //        黄金
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.gold_fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.gold_fence_gate);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.gold_wall);

        //        钻石
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.diamond_fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.diamond_fence_gate);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.diamond_wall);

        //        绿宝石
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.emerald_fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.emerald_fence_gate);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.emerald_wall);


        //        红宝石
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ruby_fence);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ruby_fence_gate);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ruby_wall);


    }
}

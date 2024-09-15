package com.myvillager.datagen;

import com.myvillager.block.ModBlocks;
import com.myvillager.block.custom.*;
import com.myvillager.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
//        addDrop(ModBlocks.adamas_block);
//        addDrop(ModBlocks.silver_block);
//        addDrop(ModBlocks.sound_block);
//        addDrop(ModBlocks.tnt_block);
        addDrop(ModBlocks.adamas_lamp_block);

    // 铜
        addDrop(ModBlocks.copper_fence);
        addDrop(ModBlocks.copper_fence_gate);
        addDrop(ModBlocks.copper_button);
        addDrop(ModBlocks.copper_stairs);
        addDrop(ModBlocks.copper_trapdoor);
        addDrop(ModBlocks.copper_pressure_plate);
        addDrop(ModBlocks.copper_wall);
        addDrop(ModBlocks.copper_door,doorDrops(ModBlocks.copper_door));
        addDrop(ModBlocks.copper_slab,slabDrops(ModBlocks.copper_slab));

        // 铁
        addDrop(ModBlocks.iron_fence);
        addDrop(ModBlocks.iron_fence_gate);
        addDrop(ModBlocks.iron_button);
        addDrop(ModBlocks.iron_stairs);
        addDrop(ModBlocks.iron_wall);
        addDrop(ModBlocks.iron_slab,slabDrops(ModBlocks.iron_slab));

        // 黄金
        addDrop(ModBlocks.gold_fence);
        addDrop(ModBlocks.gold_fence_gate);
        addDrop(ModBlocks.gold_button);
        addDrop(ModBlocks.gold_stairs);
        addDrop(ModBlocks.gold_trapdoor);
        addDrop(ModBlocks.gold_wall);
        addDrop(ModBlocks.gold_door,doorDrops(ModBlocks.gold_door));
        addDrop(ModBlocks.gold_slab,slabDrops(ModBlocks.gold_slab));

        // 钻石
        addDrop(ModBlocks.diamond_fence);
        addDrop(ModBlocks.diamond_fence_gate);
        addDrop(ModBlocks.diamond_button);
        addDrop(ModBlocks.diamond_stairs);
        addDrop(ModBlocks.diamond_trapdoor);
        addDrop(ModBlocks.diamond_pressure_plate);
        addDrop(ModBlocks.diamond_wall);
        addDrop(ModBlocks.diamond_door,doorDrops(ModBlocks.diamond_door));
        addDrop(ModBlocks.diamond_slab,slabDrops(ModBlocks.diamond_slab));

        // 绿宝石
        addDrop(ModBlocks.emerald_fence);
        addDrop(ModBlocks.emerald_fence_gate);
        addDrop(ModBlocks.emerald_button);
        addDrop(ModBlocks.emerald_stairs);
        addDrop(ModBlocks.emerald_trapdoor);
        addDrop(ModBlocks.emerald_pressure_plate);
        addDrop(ModBlocks.emerald_wall);
        addDrop(ModBlocks.emerald_door,doorDrops(ModBlocks.emerald_door));
        addDrop(ModBlocks.emerald_slab,slabDrops(ModBlocks.emerald_slab));


        // 红宝石
        addDrop(ModBlocks.ruby_block);
        addDrop(ModBlocks.ruby_fence);
        addDrop(ModBlocks.ruby_fence_gate);
        addDrop(ModBlocks.ruby_button);
        addDrop(ModBlocks.ruby_stairs);
        addDrop(ModBlocks.ruby_pressure_plate);
        addDrop(ModBlocks.ruby_wall);
        addDrop(ModBlocks.ruby_slab,slabDrops(ModBlocks.ruby_slab));

//        花
        addDrop(ModBlocks.Forever_Summer);
        addPottedPlantDrops(ModBlocks.POTTED_Forever_Summer);



//        addDrop(ModBlocks.adamas_ore,oreDrops(ModBlocks.adamas_ore, ModItems.adamas));
//        addDrop(ModBlocks.adamas_ore,copperLikeOreDrops(ModBlocks.adamas_ore, ModItems.adamas));
//        addDrop(ModBlocks.deepslate_adamas_ore,copperLikeOreDrops(ModBlocks.adamas_ore, ModItems.adamas));
//        addDrop(ModBlocks.nether_adamas_ore,copperLikeOreDrops(ModBlocks.adamas_ore, ModItems.adamas));
//        addDrop(ModBlocks.end_adamas_ore,copperLikeOreDrops(ModBlocks.adamas_ore, ModItems.adamas));
//        addDrop(ModBlocks.ruby_ore,rubyLikeOreDrops(ModBlocks.ruby_ore, ModItems.ruby));
//        addDrop(ModBlocks.deepslate_ruby_ore,rubyLikeOreDrops(ModBlocks.deepslate_ruby_ore, ModItems.ruby));


//        西红柿
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.tomato_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(tomatoCropBlock.AGE,3));
        this.addDrop(ModBlocks.tomato_crop,this.cropDrops(ModBlocks.tomato_crop,ModItems.tomato,ModItems.tomato_seeds,builder));


//        茄子
        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.eggplant_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(eggplantCropBlock.AGE,3));
        this.addDrop(ModBlocks.eggplant_crop,this.cropDrops(ModBlocks.eggplant_crop,ModItems.eggplant,ModItems.eggplant_seeds,builder1));


//        白菜
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.cabbage_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(cabbageCropBlock.AGE,3));
        this.addDrop(ModBlocks.cabbage_crop,
                this.cropDrops(ModBlocks.cabbage_crop,
                        ModItems.cabbage,ModItems.cabbage_seeds,builder2));
//        蓝莓
        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.blueberry_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(blueberryCropBlock.AGE,3));
        this.addDrop(ModBlocks.blueberry_crop,
                this.cropDrops(ModBlocks.blueberry_crop,
                        ModItems.blueberry,ModItems.blueberry_seeds,builder3));
//        草莓
        BlockStatePropertyLootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.stawberry_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(stawberryCropBlock.AGE,3));
        this.addDrop(ModBlocks.stawberry_crop,
                this.cropDrops(ModBlocks.stawberry_crop,
                        ModItems.stawberry,ModItems.stawberry_seeds,builder4));
//        韭葱
        BlockStatePropertyLootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.scallion_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(scallionCropBlock.AGE,3));
        this.addDrop(ModBlocks.scallion_crop,
                this.cropDrops(ModBlocks.scallion_crop,
                        ModItems.scallion,ModItems.scallion_seeds,builder5));
//        防风草
        BlockStatePropertyLootCondition.Builder builder6 = BlockStatePropertyLootCondition.builder(ModBlocks.parsnips_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(parsnipsCropBlock.AGE,3));
        this.addDrop(ModBlocks.parsnips_crop,
                this.cropDrops(ModBlocks.parsnips_crop,
                        ModItems.parsnips,ModItems.parsnips_seeds,builder6));
//        菠萝
        BlockStatePropertyLootCondition.Builder builder7 = BlockStatePropertyLootCondition.builder(ModBlocks.pineapple_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(pineappleCropBlock.AGE,3));
        this.addDrop(ModBlocks.pineapple_crop,
                this.cropDrops(ModBlocks.pineapple_crop,
                        ModItems.pineapple,ModItems.pineapple_seeds,builder7));
//        水稻
        BlockStatePropertyLootCondition.Builder builder8 = BlockStatePropertyLootCondition.builder(ModBlocks.paddy_crop)
                .properties(StatePredicate.Builder
                        .create().exactMatch(paddyCropBlock.AGE,3));
        this.addDrop(ModBlocks.paddy_crop,
                this.cropDrops(ModBlocks.paddy_crop,
                        ModItems.paddy,ModItems.paddy_seeds,builder8));
//        玉米
        AnyOfLootCondition.Builder builder9 = BlockStatePropertyLootCondition.builder(ModBlocks.corn_crop).properties(StatePredicate.Builder.create()
                        .exactMatch(CornCropBlock.AGE, 7))
                .or(BlockStatePropertyLootCondition.builder(ModBlocks.corn_crop).properties(StatePredicate.Builder.create()
                        .exactMatch(CornCropBlock.AGE, 8)));
        addDrop(ModBlocks.corn_crop,
                cropDrops(ModBlocks.corn_crop,
                        ModItems.corn,ModItems.corn_seeds,builder9));









    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay
                        (drop, ((LeafEntry.Builder)
                                ItemEntry.builder(ModItems.adamas)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
    public LootTable.Builder rubyLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay
                        (drop, ((LeafEntry.Builder)
                                ItemEntry.builder(ModItems.ruby)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                                .create(1.0f,1.0f))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

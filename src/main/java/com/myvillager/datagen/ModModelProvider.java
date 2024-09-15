package com.myvillager.datagen;

import com.myvillager.MyVillageMod;
import com.myvillager.block.ModBlocks;
import com.myvillager.block.custom.*;
import com.myvillager.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

//        铜
        BlockStateModelGenerator.BlockTexturePool copperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        copperPool.stairs(ModBlocks.copper_stairs);
        copperPool.slab(ModBlocks.copper_slab);
        copperPool.button(ModBlocks.copper_button);
        copperPool.pressurePlate(ModBlocks.copper_pressure_plate);
        copperPool.fence(ModBlocks.copper_fence);
        copperPool.fenceGate(ModBlocks.copper_fence_gate);
        copperPool.wall(ModBlocks.copper_wall);
        blockStateModelGenerator.registerDoor(ModBlocks.copper_door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.copper_trapdoor);

        //        铁
        BlockStateModelGenerator.BlockTexturePool ironPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);
        ironPool.stairs(ModBlocks.iron_stairs);
        ironPool.slab(ModBlocks.iron_slab);
        ironPool.button(ModBlocks.iron_button);
        ironPool.fence(ModBlocks.iron_fence);
        ironPool.fenceGate(ModBlocks.iron_fence_gate);
        ironPool.wall(ModBlocks.iron_wall);

        //        黄金
        BlockStateModelGenerator.BlockTexturePool goldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        goldPool.stairs(ModBlocks.gold_stairs);
        goldPool.slab(ModBlocks.gold_slab);
        goldPool.button(ModBlocks.gold_button);
        goldPool.fence(ModBlocks.gold_fence);
        goldPool.fenceGate(ModBlocks.gold_fence_gate);
        goldPool.wall(ModBlocks.gold_wall);
        blockStateModelGenerator.registerDoor(ModBlocks.gold_door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.gold_trapdoor);

        //        钻石
        BlockStateModelGenerator.BlockTexturePool diamondPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIAMOND_BLOCK);
        diamondPool.stairs(ModBlocks.diamond_stairs);
        diamondPool.slab(ModBlocks.diamond_slab);
        diamondPool.button(ModBlocks.diamond_button);
        diamondPool.pressurePlate(ModBlocks.diamond_pressure_plate);
        diamondPool.fence(ModBlocks.diamond_fence);
        diamondPool.fenceGate(ModBlocks.diamond_fence_gate);
        diamondPool.wall(ModBlocks.diamond_wall);
        blockStateModelGenerator.registerDoor(ModBlocks.diamond_door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.diamond_trapdoor);

        //        绿宝石
        BlockStateModelGenerator.BlockTexturePool emeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);
        emeraldPool.stairs(ModBlocks.emerald_stairs);
        emeraldPool.slab(ModBlocks.emerald_slab);
        emeraldPool.button(ModBlocks.emerald_button);
        emeraldPool.pressurePlate(ModBlocks.emerald_pressure_plate);
        emeraldPool.fence(ModBlocks.emerald_fence);
        emeraldPool.fenceGate(ModBlocks.emerald_fence_gate);
        emeraldPool.wall(ModBlocks.emerald_wall);
        blockStateModelGenerator.registerDoor(ModBlocks.emerald_door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.emerald_trapdoor);









//        BlockStateModelGenerator.BlockTexturePool adamasPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.adamas_block);
//        adamasPool.stairs(ModBlocks.adamas_stairs);
//        adamasPool.slab(ModBlocks.adamas_slab);
//        adamasPool.button(ModBlocks.adamas_button);
//        adamasPool.pressurePlate(ModBlocks.adamas_pressure_plate);
//        adamasPool.fence(ModBlocks.adamas_fence);
//        adamasPool.fenceGate(ModBlocks.adamas_fence_gate);
//        adamasPool.wall(ModBlocks.adamas_wall);
//        blockStateModelGenerator.registerDoor(ModBlocks.adamas_door);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.adamas_trapdoor);
//
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ruby_block);
        rubyPool.stairs(ModBlocks.ruby_stairs);
        rubyPool.slab(ModBlocks.ruby_slab);
        rubyPool.button(ModBlocks.ruby_button);
        rubyPool.pressurePlate(ModBlocks.ruby_pressure_plate);
        rubyPool.fence(ModBlocks.ruby_fence);
        rubyPool.fenceGate(ModBlocks.ruby_fence_gate);
        rubyPool.wall(ModBlocks.ruby_wall);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ruby_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.deepslate_ruby_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.end_ruby_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.nether_ruby_ore);
//
//
//
//
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.silver_block);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.silver_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.deepslate_silver_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.end_silver_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.nether_silver_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.adamas_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.nether_adamas_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.end_adamas_ore);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.deepslate_adamas_ore);
//
//
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.sound_block);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.tnt_block);

        blockStateModelGenerator.registerCrop(ModBlocks.tomato_crop,tomatoCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.cabbage_crop,cabbageCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.eggplant_crop,eggplantCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.blueberry_crop, blueberryCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.stawberry_crop,stawberryCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.pineapple_crop,pineappleCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.paddy_crop,paddyCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.scallion_crop,scallionCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.parsnips_crop,parsnipsCropBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerCrop(ModBlocks.corn_crop,CornCropBlock.AGE,0,1,2,3,4,5,6,7,8);

        this.registerAdamasLamp(blockStateModelGenerator);
        this.registerRubyLamp(blockStateModelGenerator);
//        花花
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.Forever_Summer,ModBlocks.POTTED_Forever_Summer, BlockStateModelGenerator.TintType.NOT_TINTED);


//        木头类
//        blockStateModelGenerator.registerLog(ModBlocks.RED_MAPLE_LOG).log(ModBlocks.RED_MAPLE_LOG).wood(ModBlocks.RED_MAPLE_WOOD);
//        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_RED_MAPLE_LOG).log(ModBlocks.STRIPPED_RED_MAPLE_LOG).wood(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
//        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_PLANKS);
//        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_LEAVES);
//        blockStateModelGenerator.registerTintableCross(ModBlocks.RED_MAPLE_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        甲片
        itemModelGenerator.register(ModItems.wooden_plate, Models.GENERATED);
        itemModelGenerator.register(ModItems.stone_plate, Models.GENERATED);
        itemModelGenerator.register(ModItems.chainmail_plate, Models.GENERATED);



        itemModelGenerator.register(ModItems.amethyst_ingot, Models.GENERATED);
//        itemModelGenerator.register(ModItems.adamas, Models.GENERATED);
        itemModelGenerator.register(ModItems.ruby, Models.GENERATED);
        itemModelGenerator.register(ModItems.green_apple, Models.GENERATED);
        itemModelGenerator.register(ModItems.tomato, Models.GENERATED);
        itemModelGenerator.register(ModItems.eggplant, Models.GENERATED);
        itemModelGenerator.register(ModItems.cabbage, Models.GENERATED);
        itemModelGenerator.register(ModItems.blueberry, Models.GENERATED);
        itemModelGenerator.register(ModItems.stawberry, Models.GENERATED);
        itemModelGenerator.register(ModItems.scallion, Models.GENERATED);
        itemModelGenerator.register(ModItems.parsnips, Models.GENERATED);
        itemModelGenerator.register(ModItems.paddy, Models.GENERATED);
        itemModelGenerator.register(ModItems.pineapple, Models.GENERATED);
        itemModelGenerator.register(ModItems.corn, Models.GENERATED);
        itemModelGenerator.register(ModItems.raw_egg, Models.GENERATED);
//        itemModelGenerator.register(ModItems.metal_detector, Models.GENERATED);
        itemModelGenerator.register(ModItems.honeycomb_briquette, Models.GENERATED);

//        熟食
        itemModelGenerator.register(ModItems.cook_corn, Models.GENERATED);
        itemModelGenerator.register(ModItems.cook_parsnips, Models.GENERATED);
        itemModelGenerator.register(ModItems.cook_scallion, Models.GENERATED);
        itemModelGenerator.register(ModItems.cook_tomato, Models.GENERATED);
        itemModelGenerator.register(ModItems.cook_egg, Models.GENERATED);
        itemModelGenerator.register(ModItems.rice, Models.GENERATED);
        itemModelGenerator.register(ModItems.salad, Models.GENERATED);
        itemModelGenerator.register(ModItems.pudding, Models.GENERATED);

//        合成食物
        itemModelGenerator.register(ModItems.pizza, Models.GENERATED);
        itemModelGenerator.register(ModItems.blueberry_cobbler, Models.GENERATED);
        itemModelGenerator.register(ModItems.hamburger, Models.GENERATED);




//        itemModelGenerator.register(ModBlocks.adamas_block.asItem(),registerItemBlock(ModBlocks.adamas_block));
//        itemModelGenerator.register(ModBlocks.adamas_ore.asItem(),registerItemBlock(ModBlocks.adamas_ore));
//        itemModelGenerator.register(ModBlocks.deepslate_adamas_ore.asItem(),registerItemBlock(ModBlocks.deepslate_adamas_ore));
//        itemModelGenerator.register(ModBlocks.end_adamas_ore.asItem(),registerItemBlock(ModBlocks.end_adamas_ore));
//        itemModelGenerator.register(ModBlocks.nether_adamas_ore.asItem(),registerItemBlock(ModBlocks.nether_adamas_ore));
//
//        itemModelGenerator.register(ModBlocks.silver_block.asItem(),registerItemBlock(ModBlocks.silver_block));
//        itemModelGenerator.register(ModBlocks.silver_ore.asItem(),registerItemBlock(ModBlocks.silver_ore));
//        itemModelGenerator.register(ModBlocks.deepslate_silver_ore.asItem(),registerItemBlock(ModBlocks.deepslate_silver_ore));
//        itemModelGenerator.register(ModBlocks.end_silver_ore.asItem(),registerItemBlock(ModBlocks.end_silver_ore));
//        itemModelGenerator.register(ModBlocks.nether_silver_ore.asItem(),registerItemBlock(ModBlocks.nether_silver_ore));

        itemModelGenerator.register(ModBlocks.ruby_block.asItem(),registerItemBlock(ModBlocks.ruby_block));
//        itemModelGenerator.register(ModBlocks.ruby_ore.asItem(),registerItemBlock(ModBlocks.ruby_ore));
//        itemModelGenerator.register(ModBlocks.deepslate_ruby_ore.asItem(),registerItemBlock(ModBlocks.deepslate_ruby_ore));
//        itemModelGenerator.register(ModBlocks.end_ruby_ore.asItem(),registerItemBlock(ModBlocks.end_ruby_ore));
//        itemModelGenerator.register(ModBlocks.nether_ruby_ore.asItem(),registerItemBlock(ModBlocks.nether_ruby_ore));
//
//        itemModelGenerator.register(ModBlocks.sound_block.asItem(),registerItemBlock(ModBlocks.sound_block));
//        itemModelGenerator.register(ModBlocks.tnt_block.asItem(),registerItemBlock(ModBlocks.tnt_block));

        itemModelGenerator.register(ModBlocks.adamas_lamp_block.asItem(),new Model(Optional.of(new Identifier(MyVillageMod.MOD_ID,
                ModelIds.getBlockModelId(ModBlocks.adamas_lamp_block).getPath()+"_off")),
                Optional.empty()));

        itemModelGenerator.register(ModBlocks.ruby_lamp_block.asItem(),new Model(Optional.of(new Identifier(MyVillageMod.MOD_ID,
                ModelIds.getBlockModelId(ModBlocks.ruby_lamp_block).getPath()+"_off")),
                Optional.empty()));
//铜
        itemModelGenerator.register(ModBlocks.copper_pressure_plate.asItem(),registerItemBlock(ModBlocks.copper_pressure_plate));
        itemModelGenerator.register(ModBlocks.copper_fence_gate.asItem(),registerItemBlock(ModBlocks.copper_fence_gate));

//铁
        itemModelGenerator.register(ModBlocks.iron_fence_gate.asItem(),registerItemBlock(ModBlocks.iron_fence_gate));

//黄金
        itemModelGenerator.register(ModBlocks.gold_fence_gate.asItem(),registerItemBlock(ModBlocks.gold_fence_gate));


//钻石
        itemModelGenerator.register(ModBlocks.diamond_pressure_plate.asItem(),registerItemBlock(ModBlocks.diamond_pressure_plate));
        itemModelGenerator.register(ModBlocks.diamond_fence_gate.asItem(),registerItemBlock(ModBlocks.diamond_fence_gate));

//绿宝石
        itemModelGenerator.register(ModBlocks.emerald_pressure_plate.asItem(),registerItemBlock(ModBlocks.emerald_pressure_plate));
        itemModelGenerator.register(ModBlocks.emerald_fence_gate.asItem(),registerItemBlock(ModBlocks.emerald_fence_gate));


//        itemModelGenerator.register(ModBlocks.adamas_pressure_plate.asItem(),registerItemBlock(ModBlocks.adamas_pressure_plate));
//        itemModelGenerator.register(ModBlocks.adamas_fence_gate.asItem(),registerItemBlock(ModBlocks.adamas_fence_gate));
//        itemModelGenerator.register(ModBlocks.ruby_pressure_plate.asItem(),registerItemBlock(ModBlocks.ruby_pressure_plate));
//        itemModelGenerator.register(ModBlocks.ruby_fence_gate.asItem(),registerItemBlock(ModBlocks.ruby_fence_gate));

//        绿宝石套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.emerald_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.emerald_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.emerald_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.emerald_boots);

        itemModelGenerator.register(ModItems.emerald_sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.emerald_axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.emerald_pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.emerald_shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.emerald_hoe, Models.HANDHELD);

        //        红宝石套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ruby_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ruby_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ruby_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ruby_boots);

        itemModelGenerator.register(ModItems.ruby_sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ruby_axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ruby_pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ruby_shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ruby_hoe, Models.HANDHELD);

//        铜套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.copper_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.copper_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.copper_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.copper_boots);

        itemModelGenerator.register(ModItems.copper_sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.copper_axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.copper_pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.copper_shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.copper_hoe, Models.HANDHELD);

//        青金石铜套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.blue_copper_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.blue_copper_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.blue_copper_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.blue_copper_boots);

//        木头套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.wooden_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.wooden_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.wooden_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.wooden_boots);

//        石头套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.stone_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.stone_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.stone_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.stone_boots);

//        紫水晶套装
        itemModelGenerator.registerArmor((ArmorItem) ModItems.amethyst_helmet);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.amethyst_chestplate);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.amethyst_leggings);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.amethyst_boots);

        itemModelGenerator.register(ModItems.amethyst_sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.amethyst_axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.amethyst_pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.amethyst_shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.amethyst_hoe, Models.HANDHELD);









    }
    private static Model registerItemBlock(Block block, TextureKey...requiredTextureKeys){
        String name = ModelIds.getBlockModelId(block).getPath();
        return new Model(Optional.of(new Identifier(MyVillageMod.MOD_ID,name)),Optional.empty(),requiredTextureKeys);
    }

    private void registerAdamasLamp(BlockStateModelGenerator blockStateModelGenerator){
        Identifier identifier = Models.CUBE_ALL.upload(ModBlocks.adamas_lamp_block,"_off",
                TextureMap.all(TextureMap.getSubId(ModBlocks.adamas_lamp_block,"_off")),
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 =blockStateModelGenerator.createSubModel(ModBlocks.adamas_lamp_block,"_on",
                Models.CUBE_ALL,TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(ModBlocks.adamas_lamp_block)
                .coordinate(BlockStateModelGenerator
                        .createBooleanModelMap(AdamasLampBlock.LIT,identifier2,identifier)));

    }

    private void registerRubyLamp(BlockStateModelGenerator blockStateModelGenerator){
        Identifier identifier = Models.CUBE_ALL.upload(ModBlocks.ruby_lamp_block,"_off",
                TextureMap.all(TextureMap.getSubId(ModBlocks.ruby_lamp_block,"_off")),
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 =blockStateModelGenerator.createSubModel(ModBlocks.ruby_lamp_block,"_on",
                Models.CUBE_ALL,TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(ModBlocks.ruby_lamp_block)
                .coordinate(BlockStateModelGenerator
                        .createBooleanModelMap(AdamasLampBlock.LIT,identifier2,identifier)));

    }
}

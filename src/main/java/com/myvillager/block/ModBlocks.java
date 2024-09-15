package com.myvillager.block;

import com.myvillager.MyVillageMod;
import com.myvillager.block.custom.*;
import com.myvillager.world.tree.MapleSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
//    添加银块
//    public static final Block silver_block = registerBlock("silver_block",
//            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    银矿
//    public static final Block silver_ore = registerBlock("silver_ore",
//        new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2,5)));
//
//    public static final Block deepslate_silver_ore = registerBlock("deepslate_silver_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2,5)));
//
//    public static final Block nether_silver_ore = registerBlock("nether_silver_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f), UniformIntProvider.create(2,5)));
//
//    public static final Block end_silver_ore = registerBlock("end_silver_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f), UniformIntProvider.create(2,5)));




//    public static final Block sound_block = registerBlock("sound_block",
//            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block tnt_block = registerBlock("tnt_block",
//            new TNTBlock(FabricBlockSettings.copyOf(Blocks.TNT)));
    public static final Block adamas_lamp_block = registerBlock("adamas_lamp_block",
            new AdamasLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP).strength(4f).requiresTool()
                    .luminance(state -> state.get(AdamasLampBlock.LIT) ? 15 : 0)));

    public static final Block ruby_lamp_block = registerBlock("ruby_lamp_block",
            new AdamasLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP).strength(4f).requiresTool()
                    .luminance(state -> state.get(AdamasLampBlock.LIT) ? 15 : 0)));


//    红宝石系列
public static final Block ruby_block = registerBlock("ruby_block",
        new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
//    public static final Block ruby_ore = registerBlock("ruby_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2,5)));
//    public static final Block deepslate_ruby_ore = registerBlock("deepslate_ruby_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2,5)));
//    public static final Block nether_ruby_ore = registerBlock("nether_ruby_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f), UniformIntProvider.create(2,5)));
//    public static final Block end_ruby_ore = registerBlock("end_ruby_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f), UniformIntProvider.create(2,5)));
//    public static final Block ruby_stairs = registerBlock("ruby_stairs",
//            new StairsBlock(ModBlocks.ruby_block.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block ruby_slab = registerBlock("ruby_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block ruby_button = registerBlock("ruby_button",
//            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON,10,true));
//    public static final Block ruby_pressure_plate = registerBlock("ruby_pressure_plate",
//            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
//                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),
//                    BlockSetType.IRON));
//    public static final Block ruby_fence = registerBlock("ruby_fence",
//            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block ruby_fence_gate = registerBlock("ruby_fence_gate",
//            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),WoodType.ACACIA));
//    public static final Block ruby_wall = registerBlock("ruby_wall",
//            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block ruby_door = registerBlock("ruby_door",
//            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON));
//    public static final Block ruby_trapdoor = registerBlock("ruby_trapdoor",
//            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON));

//添加花朵
public static final Block Forever_Summer = registerBlock("forever_summer",
        new FlowerBlock(StatusEffects.FIRE_RESISTANCE,10,
                FabricBlockSettings
                        .copyOf(Blocks.ALLIUM)
                        .nonOpaque()
                        .noCollision()));
public static final Block POTTED_Forever_Summer =
        Registry.register(Registries.BLOCK,new Identifier(MyVillageMod.MOD_ID, "potted_forever_summer"),
                new FlowerPotBlock(Forever_Summer,FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)
                .nonOpaque()));







    //    添加蓝宝石块
//    public static final Block adamas_block = registerBlock("adamas_block",
//        new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
//    public static final Block adamas_ore = registerBlock("adamas_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2,5)));
//    public static final Block deepslate_adamas_ore = registerBlock("deepslate_adamas_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2,5)));
//    public static final Block nether_adamas_ore = registerBlock("nether_adamas_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f), UniformIntProvider.create(2,5)));
//    public static final Block end_adamas_ore = registerBlock("end_adamas_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f), UniformIntProvider.create(2,5)));
//    public static final Block adamas_stairs = registerBlock("adamas_stairs",
//            new StairsBlock(ModBlocks.adamas_block.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block adamas_slab = registerBlock("adamas_slab",
//            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block adamas_button = registerBlock("adamas_button",
//            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON,10,true));
//    public static final Block adamas_pressure_plate = registerBlock("adamas_pressure_plate",
//            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
//                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),
//                    BlockSetType.IRON));
//    public static final Block adamas_fence = registerBlock("adamas_fence",
//            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block adamas_fence_gate = registerBlock("adamas_fence_gate",
//            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),WoodType.ACACIA));
//    public static final Block adamas_wall = registerBlock("adamas_wall",
//            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
//    public static final Block adamas_door = registerBlock("adamas_door",
//            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON));
//    public static final Block adamas_trapdoor = registerBlock("adamas_trapdoor",
//            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON));

//种子类
    public static final Block tomato_crop = registerBlockWithoutItem("tomato_crop",
            new tomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block eggplant_crop = registerBlockWithoutItem("eggplant_crop",
            new eggplantCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block cabbage_crop = registerBlockWithoutItem("cabbage_crop",
            new cabbageCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block blueberry_crop = registerBlockWithoutItem("blueberry_crop",
            new blueberryCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));
    public static final Block paddy_crop = registerBlockWithoutItem("paddy_crop",
            new paddyCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block parsnips_crop = registerBlockWithoutItem("parsnips_crop",
            new parsnipsCropBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));
    public static final Block scallion_crop = registerBlockWithoutItem("scallion_crop",
            new scallionCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block pineapple_crop = registerBlockWithoutItem("pineapple_crop",
            new pineappleCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));
    public static final Block stawberry_crop = registerBlockWithoutItem("stawberry_crop",
            new stawberryCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));

    public static final Block corn_crop = registerBlockWithoutItem("corn_crop",
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


//    原版拓展方块

//    铁
    public static final Block iron_stairs = registerBlock("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block iron_slab = registerBlock("iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block iron_button = registerBlock("iron_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON,10,true));
    public static final Block iron_fence = registerBlock("iron_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block iron_fence_gate = registerBlock("iron_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),WoodType.ACACIA));
    public static final Block iron_wall = registerBlock("iron_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    //    金
    public static final Block gold_stairs = registerBlock("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block gold_slab = registerBlock("gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block gold_button = registerBlock("gold_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK),BlockSetType.IRON,10,true));
    public static final Block gold_fence = registerBlock("gold_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block gold_fence_gate = registerBlock("gold_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK),WoodType.ACACIA));
    public static final Block gold_wall = registerBlock("gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static final Block gold_door = registerBlock("gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque(),BlockSetType.IRON));
    public static final Block gold_trapdoor = registerBlock("gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque(),BlockSetType.IRON));


    //    钻石
    public static final Block diamond_stairs = registerBlock("diamond_stairs",
            new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block diamond_slab = registerBlock("diamond_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block diamond_button = registerBlock("diamond_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK),BlockSetType.IRON,10,true));
    public static final Block diamond_pressure_plate = registerBlock("diamond_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK),
                    BlockSetType.IRON));
    public static final Block diamond_fence = registerBlock("diamond_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block diamond_fence_gate = registerBlock("diamond_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK),WoodType.ACACIA));
    public static final Block diamond_wall = registerBlock("diamond_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block diamond_door = registerBlock("diamond_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).nonOpaque(),BlockSetType.IRON));
    public static final Block diamond_trapdoor = registerBlock("diamond_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).nonOpaque(),BlockSetType.IRON));


    //    绿宝石
    public static final Block emerald_stairs = registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block emerald_slab = registerBlock("emerald_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block emerald_button = registerBlock("emerald_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK),BlockSetType.IRON,10,true));
    public static final Block emerald_pressure_plate = registerBlock("emerald_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK),
                    BlockSetType.IRON));
    public static final Block emerald_fence = registerBlock("emerald_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block emerald_fence_gate = registerBlock("emerald_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK),WoodType.ACACIA));
    public static final Block emerald_wall = registerBlock("emerald_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block emerald_door = registerBlock("emerald_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).nonOpaque(),BlockSetType.IRON));
    public static final Block emerald_trapdoor = registerBlock("emerald_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).nonOpaque(),BlockSetType.IRON));



    //    铜
    public static final Block copper_stairs = registerBlock("copper_stairs",
            new StairsBlock(Blocks.COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block copper_slab = registerBlock("copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block copper_button = registerBlock("copper_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK),BlockSetType.IRON,10,true));
    public static final Block copper_pressure_plate = registerBlock("copper_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK),
                    BlockSetType.IRON));
    public static final Block copper_fence = registerBlock("copper_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block copper_fence_gate = registerBlock("copper_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK),WoodType.ACACIA));
    public static final Block copper_wall = registerBlock("copper_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    public static final Block copper_door = registerBlock("copper_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).nonOpaque(),BlockSetType.IRON));
    public static final Block copper_trapdoor = registerBlock("copper_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).nonOpaque(),BlockSetType.IRON));


//  红宝石
public static final Block ruby_stairs = registerBlock("ruby_stairs",
        new StairsBlock(ModBlocks.ruby_block.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.ruby_block)));
    public static final Block ruby_slab = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.ruby_block)));
    public static final Block ruby_button = registerBlock("ruby_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.ruby_block),BlockSetType.IRON,10,true));
    public static final Block ruby_pressure_plate = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.ruby_block),
                    BlockSetType.IRON));
    public static final Block ruby_fence = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.ruby_block)));
    public static final Block ruby_fence_gate = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.ruby_block),WoodType.ACACIA));
    public static final Block ruby_wall = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.ruby_block)));



//    树系列
//    public static final Block RED_MAPLE_LOG = registerBlock("red_maple_log",
//            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()));
//    public static final Block RED_MAPLE_WOOD = registerBlock("red_maple_wood",
//            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()));
//    public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
//            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()));
//    public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
//            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()));
//
//    public static final Block RED_MAPLE_PLANKS = registerBlock("red_maple_planks",
//            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()));
//    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
//            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()));
//
//    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
//            new SaplingBlock(new MapleSaplingGenerator(),
//                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()));




//    添加方块组方法
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(MyVillageMod.MOD_ID,name),block);
    }
//    添加注册方块
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(MyVillageMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
    private static Block registerBlockWithoutItem(String name,Block block){
        return Registry.register(Registries.BLOCK,new Identifier(MyVillageMod.MOD_ID,name),block);
    }
//    消息提示，添加日志
    public static void registerModBlocks(){
        MyVillageMod.LOGGER.info("注册自定义方块" + MyVillageMod.MOD_ID);
    }
}

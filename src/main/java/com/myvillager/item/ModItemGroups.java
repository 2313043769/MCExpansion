package com.myvillager.item;

import com.myvillager.MyVillageMod;
import com.myvillager.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final String ITEM_NAME = "itemgroup.village";
    public static final String BUILD_NAME = "buildgroup.village";
//    添加物品栏:自然世界物品
    public static final ItemGroup VILLAGE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MyVillageMod.MOD_ID,"village"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.village"))
                    .icon(() -> new ItemStack(ModItems.ruby)).entries((displayContext, entries) -> {



                    entries.add(ModItems.tomato);
                    entries.add(ModItems.tomato_seeds);
                    entries.add(ModItems.green_apple);
                    entries.add(ModItems.cabbage);
                    entries.add(ModItems.cabbage_seeds);
                    entries.add(ModItems.eggplant);
                    entries.add(ModItems.eggplant_seeds);
                    entries.add(ModItems.blueberry);
                    entries.add(ModItems.blueberry_seeds);
                    entries.add(ModItems.stawberry);
                    entries.add(ModItems.stawberry_seeds);
                    entries.add(ModItems.pineapple);
                    entries.add(ModItems.pineapple_seeds);
                    entries.add(ModItems.paddy);
                    entries.add(ModItems.paddy_seeds);
                    entries.add(ModItems.scallion);
                    entries.add(ModItems.scallion_seeds);
                    entries.add(ModItems.parsnips);
                    entries.add(ModItems.parsnips_seeds);
                    entries.add(ModItems.corn);
                    entries.add(ModItems.corn_seeds);

                    entries.add(ModItems.honeycomb_briquette);
                    entries.add(ModBlocks.Forever_Summer);

                    entries.add(ModItems.cook_corn);
                    entries.add(ModItems.cook_scallion);
                    entries.add(ModItems.cook_parsnips);
                    entries.add(ModItems.rice);
                    entries.add(ModItems.raw_egg);
                    entries.add(ModItems.cook_egg);
                    entries.add(ModItems.cook_tomato);


                    entries.add(ModItems.pizza);
                    entries.add(ModItems.blueberry_cobbler);
                    entries.add(ModItems.hamburger);
                    entries.add(ModItems.salad);
                    entries.add(ModItems.pudding);

//                        合成甲片
                    entries.add(ModItems.wooden_plate);
                    entries.add(ModItems.stone_plate);
                    entries.add(ModItems.chainmail_plate);
                    entries.add(ModItems.amethyst_ingot);




//                  entries.add(ModItems.metal_detector);

//                  entries.add(ModBlocks.sound_block);
//                  entries.add(ModBlocks.tnt_block);



                    //             银矿
//                    entries.add(ModItems.silver);
//                    entries.add(ModBlocks.silver_block);
//                    entries.add(ModBlocks.silver_ore);
//                    entries.add(ModBlocks.deepslate_silver_ore);
//                    entries.add(ModBlocks.nether_silver_ore);
//                    entries.add(ModBlocks.end_silver_ore);



//                    蓝宝石
//                    entries.add(ModItems.adamas);
                    entries.add(ModBlocks.adamas_lamp_block);
//                    entries.add(ModBlocks.adamas_block);
//                    entries.add(ModBlocks.adamas_ore);
//                    entries.add(ModBlocks.deepslate_adamas_ore);
//                    entries.add(ModBlocks.nether_adamas_ore);
//                    entries.add(ModBlocks.end_adamas_ore);
//                    entries.add(ModBlocks.adamas_fence);
//                    entries.add(ModBlocks.adamas_fence_gate);
//
//                    entries.add(ModBlocks.adamas_slab);
//                    entries.add(ModBlocks.adamas_stairs);
//                    entries.add(ModBlocks.adamas_wall);
//                    entries.add(ModBlocks.adamas_button);
//                    entries.add(ModBlocks.adamas_pressure_plate);
//                    entries.add(ModBlocks.adamas_door);
//                    entries.add(ModBlocks.adamas_trapdoor);


//                    红宝石
                    entries.add(ModItems.ruby);
                    entries.add(ModBlocks.ruby_lamp_block);
//                    entries.add(ModBlocks.ruby_ore);
//                    entries.add(ModBlocks.deepslate_ruby_ore);
//                    entries.add(ModBlocks.nether_ruby_ore);
//                    entries.add(ModBlocks.end_ruby_ore);
//                    entries.add(ModBlocks.ruby_fence);
//                    entries.add(ModBlocks.ruby_fence_gate);
//                    entries.add(ModBlocks.ruby_slab);
//                    entries.add(ModBlocks.ruby_stairs);
//                    entries.add(ModBlocks.ruby_wall);
//                    entries.add(ModBlocks.ruby_button);
//                    entries.add(ModBlocks.ruby_pressure_plate);
//                    entries.add(ModBlocks.ruby_trapdoor);
//                    entries.add(ModBlocks.ruby_door);


                    entries.add(ModItems.emerald_helmet);
                    entries.add(ModItems.emerald_chestplate);
                    entries.add(ModItems.emerald_leggings);
                    entries.add(ModItems.emerald_boots);
                    entries.add(ModItems.emerald_sword);
                    entries.add(ModItems.emerald_axe);
                    entries.add(ModItems.emerald_pickaxe);
                    entries.add(ModItems.emerald_shovel);
                    entries.add(ModItems.emerald_hoe);

                    entries.add(ModItems.copper_helmet);
                    entries.add(ModItems.copper_chestplate);
                    entries.add(ModItems.copper_leggings);
                    entries.add(ModItems.copper_boots);
                    entries.add(ModItems.blue_copper_helmet);
                    entries.add(ModItems.blue_copper_chestplate);
                    entries.add(ModItems.blue_copper_leggings);
                    entries.add(ModItems.blue_copper_boots);
                    entries.add(ModItems.copper_sword);
                    entries.add(ModItems.copper_axe);
                    entries.add(ModItems.copper_pickaxe);
                    entries.add(ModItems.copper_shovel);
                    entries.add(ModItems.copper_hoe);

                    entries.add(ModItems.wooden_helmet);
                    entries.add(ModItems.wooden_chestplate);
                    entries.add(ModItems.wooden_leggings);
                    entries.add(ModItems.wooden_boots);

                    entries.add(ModItems.stone_helmet);
                    entries.add(ModItems.stone_chestplate);
                    entries.add(ModItems.stone_leggings);
                    entries.add(ModItems.stone_boots);

                    entries.add(ModItems.amethyst_helmet);
                    entries.add(ModItems.amethyst_chestplate);
                    entries.add(ModItems.amethyst_leggings);
                    entries.add(ModItems.amethyst_boots);

                    entries.add(ModItems.amethyst_sword);
                    entries.add(ModItems.amethyst_axe);
                    entries.add(ModItems.amethyst_pickaxe);
                    entries.add(ModItems.amethyst_shovel);
                    entries.add(ModItems.amethyst_hoe);

                    entries.add(ModItems.ruby_helmet);
                    entries.add(ModItems.ruby_chestplate);
                    entries.add(ModItems.ruby_leggings);
                    entries.add(ModItems.ruby_boots);

                    entries.add(ModItems.ruby_sword);
                    entries.add(ModItems.ruby_axe);
                    entries.add(ModItems.ruby_pickaxe);
                    entries.add(ModItems.ruby_shovel);
                    entries.add(ModItems.ruby_hoe);

                    }).build());
    //    添加物品栏：自然世界（暂定）
    private static final ItemGroup build_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MyVillageMod.MOD_ID,"village2"), FabricItemGroup.builder().displayName(Text.translatable("buildgroup.village"))
                    .icon(() -> new ItemStack(ModBlocks.diamond_stairs)).entries((displayContext, entries) -> {

//                  铜
                    entries.add(ModBlocks.copper_fence);
                    entries.add(ModBlocks.copper_fence_gate);
                    entries.add(ModBlocks.copper_slab);
                    entries.add(ModBlocks.copper_stairs);
                    entries.add(ModBlocks.copper_wall);
                    entries.add(ModBlocks.copper_button);
                    entries.add(ModBlocks.copper_pressure_plate);
                    entries.add(ModBlocks.copper_trapdoor);
                    entries.add(ModBlocks.copper_door);

                    //                  铁
                    entries.add(ModBlocks.iron_fence);
                    entries.add(ModBlocks.iron_fence_gate);
                    entries.add(ModBlocks.iron_slab);
                    entries.add(ModBlocks.iron_stairs);
                    entries.add(ModBlocks.iron_wall);
                    entries.add(ModBlocks.iron_button);

                    //                  黄金
                    entries.add(ModBlocks.gold_fence);
                    entries.add(ModBlocks.gold_fence_gate);
                    entries.add(ModBlocks.gold_slab);
                    entries.add(ModBlocks.gold_stairs);
                    entries.add(ModBlocks.gold_wall);
                    entries.add(ModBlocks.gold_button);
                    entries.add(ModBlocks.gold_trapdoor);
                    entries.add(ModBlocks.gold_door);

                    //                  钻石
                    entries.add(ModBlocks.diamond_fence);
                    entries.add(ModBlocks.diamond_fence_gate);
                    entries.add(ModBlocks.diamond_slab);
                    entries.add(ModBlocks.diamond_stairs);
                    entries.add(ModBlocks.diamond_wall);
                    entries.add(ModBlocks.diamond_button);
                    entries.add(ModBlocks.diamond_pressure_plate);
                    entries.add(ModBlocks.diamond_trapdoor);
                    entries.add(ModBlocks.diamond_door);

                    //                  绿宝石
                    entries.add(ModBlocks.emerald_fence);
                    entries.add(ModBlocks.emerald_fence_gate);
                    entries.add(ModBlocks.emerald_slab);
                    entries.add(ModBlocks.emerald_stairs);
                    entries.add(ModBlocks.emerald_wall);
                    entries.add(ModBlocks.emerald_button);
                    entries.add(ModBlocks.emerald_pressure_plate);
                    entries.add(ModBlocks.emerald_trapdoor);
                    entries.add(ModBlocks.emerald_door);

//                  红宝石
                    entries.add(ModBlocks.ruby_block);
                    entries.add(ModBlocks.ruby_fence);
                    entries.add(ModBlocks.ruby_fence_gate);
                    entries.add(ModBlocks.ruby_slab);
                    entries.add(ModBlocks.ruby_stairs);
                    entries.add(ModBlocks.ruby_wall);
                    entries.add(ModBlocks.ruby_button);
                    entries.add(ModBlocks.ruby_pressure_plate);

                    }).build());


    public static void registerItemGroups(){
        MyVillageMod.LOGGER.info("模组测试板块" + MyVillageMod.MOD_ID);
    }
}

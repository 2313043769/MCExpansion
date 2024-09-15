package com.myvillager.datagen;

import com.myvillager.block.ModBlocks;
import com.myvillager.item.ModItemGroups;
import com.myvillager.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.ItemGroup;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(ModItems.amethyst_ingot, "紫水晶锭");
//        translationBuilder.add(ModBlocks.silver_block, "银块");
//        translationBuilder.add(ModBlocks.silver_ore, "银矿");
//        translationBuilder.add(ModBlocks.deepslate_silver_ore, "深层银矿");
//        translationBuilder.add(ModBlocks.end_silver_ore, "末地银矿");
//        translationBuilder.add(ModBlocks.nether_silver_ore, "下界银矿");






//        translationBuilder.add(ModItems.adamas, "蓝宝石");
//        translationBuilder.add(ModBlocks.adamas_block, "蓝宝石块");
//        translationBuilder.add(ModBlocks.adamas_ore, "蓝宝石矿");
//        translationBuilder.add(ModBlocks.deepslate_adamas_ore, "深层蓝宝石矿");
//        translationBuilder.add(ModBlocks.end_adamas_ore, "末地蓝宝石矿");
//        translationBuilder.add(ModBlocks.nether_adamas_ore, "下界蓝宝石矿");
//        translationBuilder.add(ModBlocks.adamas_stairs, "蓝宝石楼梯");
//        translationBuilder.add(ModBlocks.adamas_slab, "蓝宝石半砖");
//        translationBuilder.add(ModBlocks.adamas_button, "蓝宝石按钮");
//        translationBuilder.add(ModBlocks.adamas_pressure_plate, "蓝宝石压力板");
//        translationBuilder.add(ModBlocks.adamas_fence, "蓝宝石栅栏");
//        translationBuilder.add(ModBlocks.adamas_fence_gate, "蓝宝石栅栏门");
//        translationBuilder.add(ModBlocks.adamas_wall, "蓝宝石围墙");
//        translationBuilder.add(ModBlocks.adamas_door, "蓝宝石门");
//        translationBuilder.add(ModBlocks.adamas_trapdoor, "蓝宝石活板门");


        //        红宝石
        translationBuilder.add(ModItems.ruby, "红宝石");
        translationBuilder.add(ModBlocks.ruby_block, "红宝石块");
        translationBuilder.add(ModBlocks.ruby_stairs, "红宝石楼梯");
        translationBuilder.add(ModBlocks.ruby_slab, "红宝石半砖");
        translationBuilder.add(ModBlocks.ruby_button, "红宝石按钮");
        translationBuilder.add(ModBlocks.ruby_pressure_plate, "红宝石压力板");
        translationBuilder.add(ModBlocks.ruby_fence, "红宝石栅栏");
        translationBuilder.add(ModBlocks.ruby_fence_gate, "红宝石栅栏门");
        translationBuilder.add(ModBlocks.ruby_wall, "红宝石围墙");
        translationBuilder.add(ModItems.ruby_helmet,"红宝石头盔");
        translationBuilder.add(ModItems.ruby_chestplate,"红宝石胸甲");
        translationBuilder.add(ModItems.ruby_leggings,"红宝石护腿");
        translationBuilder.add(ModItems.ruby_boots,"红宝石靴子");
        translationBuilder.add(ModItems.ruby_sword,"红宝石剑");
        translationBuilder.add(ModItems.ruby_pickaxe,"红宝石镐");
        translationBuilder.add(ModItems.ruby_axe,"红宝石斧");
        translationBuilder.add(ModItems.ruby_shovel,"红宝石铲");
        translationBuilder.add(ModItems.ruby_hoe,"红宝石锄");


//        translationBuilder.add(ModBlocks.ruby_ore, "红宝石矿");
//        translationBuilder.add(ModBlocks.deepslate_ruby_ore, "深层红宝石矿");
//        translationBuilder.add(ModBlocks.end_ruby_ore, "末地红宝石矿");
//        translationBuilder.add(ModBlocks.nether_ruby_ore, "下界红宝石矿");
//        translationBuilder.add(ModBlocks.ruby_stairs, "红宝石楼梯");
//        translationBuilder.add(ModBlocks.ruby_slab, "红宝石半砖");
//        translationBuilder.add(ModBlocks.ruby_button, "红宝石按钮");
//        translationBuilder.add(ModBlocks.ruby_pressure_plate, "红宝石压力板");
//        translationBuilder.add(ModBlocks.ruby_fence, "红宝石栅栏");
//        translationBuilder.add(ModBlocks.ruby_fence_gate, "红宝石栅栏门");
//        translationBuilder.add(ModBlocks.ruby_wall, "红宝石围墙");
//        translationBuilder.add(ModBlocks.ruby_door, "红宝石门");
//        translationBuilder.add(ModBlocks.ruby_trapdoor, "红宝石活板门");


//        translationBuilder.add(ModItems.metal_detector, "金属探测器");
//        translationBuilder.add(ModBlocks.sound_block, "木琴");
//        translationBuilder.add(ModBlocks.tnt_block,"雷管");
        translationBuilder.add(ModBlocks.adamas_lamp_block,"蓝宝石灯");
        translationBuilder.add(ModBlocks.ruby_lamp_block,"红宝石灯");


        translationBuilder.add(ModItems.tomato, "西红柿");
        translationBuilder.add(ModItems.tomato_seeds, "西红柿种子");
        translationBuilder.add(ModItems.green_apple, "青苹果");
        translationBuilder.add(ModItems.eggplant, "茄子");
        translationBuilder.add(ModItems.eggplant_seeds, "茄子种子");
        translationBuilder.add(ModItems.cabbage, "白菜");
        translationBuilder.add(ModItems.cabbage_seeds, "白菜种子");
        translationBuilder.add(ModItems.blueberry, "蓝莓");
        translationBuilder.add(ModItems.blueberry_seeds, "蓝莓种子");
        translationBuilder.add(ModItems.stawberry, "草莓");
        translationBuilder.add(ModItems.stawberry_seeds, "草莓种子");
        translationBuilder.add(ModItems.scallion, "韭葱");
        translationBuilder.add(ModItems.scallion_seeds, "韭葱种子");
        translationBuilder.add(ModItems.parsnips, "防风草");
        translationBuilder.add(ModItems.parsnips_seeds, "防风草种子");
        translationBuilder.add(ModItems.paddy, "水稻");
        translationBuilder.add(ModItems.paddy_seeds, "水稻种子");
        translationBuilder.add(ModItems.pineapple, "菠萝");
        translationBuilder.add(ModItems.pineapple_seeds, "菠萝种子");
        translationBuilder.add(ModItems.corn, "玉米");
        translationBuilder.add(ModItems.corn_seeds, "玉米种子");
        translationBuilder.add(ModItems.raw_egg, "生鸡蛋");


        translationBuilder.add(ModItems.honeycomb_briquette, "蜂窝煤");




        translationBuilder.add(ModItems.wooden_helmet,"木制头盔");
        translationBuilder.add(ModItems.wooden_chestplate,"木制胸甲");
        translationBuilder.add(ModItems.wooden_leggings,"木制护腿");
        translationBuilder.add(ModItems.wooden_boots,"木制靴子");

        translationBuilder.add(ModItems.stone_helmet,"石制头盔");
        translationBuilder.add(ModItems.stone_chestplate,"石制胸甲");
        translationBuilder.add(ModItems.stone_leggings,"石制护腿");
        translationBuilder.add(ModItems.stone_boots,"石制靴子");

        translationBuilder.add(ModItems.amethyst_helmet,"紫水晶头盔");
        translationBuilder.add(ModItems.amethyst_chestplate,"紫水晶胸甲");
        translationBuilder.add(ModItems.amethyst_leggings,"紫水晶护腿");
        translationBuilder.add(ModItems.amethyst_boots,"紫水晶靴子");
        translationBuilder.add(ModItems.amethyst_sword,"紫水晶剑");
        translationBuilder.add(ModItems.amethyst_pickaxe,"紫水晶镐");
        translationBuilder.add(ModItems.amethyst_axe,"紫水晶斧");
        translationBuilder.add(ModItems.amethyst_shovel,"紫水晶铲");
        translationBuilder.add(ModItems.amethyst_hoe,"紫水晶锄");

        translationBuilder.add(ModItems.emerald_helmet,"绿宝石头盔");
        translationBuilder.add(ModItems.emerald_chestplate,"绿宝石胸甲");
        translationBuilder.add(ModItems.emerald_leggings,"绿宝石护腿");
        translationBuilder.add(ModItems.emerald_boots,"绿宝石靴子");
        translationBuilder.add(ModItems.emerald_sword,"绿宝石剑");
        translationBuilder.add(ModItems.emerald_pickaxe,"绿宝石镐");
        translationBuilder.add(ModItems.emerald_axe,"绿宝石斧");
        translationBuilder.add(ModItems.emerald_shovel,"绿宝石铲");
        translationBuilder.add(ModItems.emerald_hoe,"绿宝石锄");

        translationBuilder.add(ModItems.copper_helmet,"铜制头盔");
        translationBuilder.add(ModItems.copper_chestplate,"铜制胸甲");
        translationBuilder.add(ModItems.copper_leggings,"铜制护腿");
        translationBuilder.add(ModItems.copper_boots,"铜制靴子");
        translationBuilder.add(ModItems.copper_sword,"铜剑");
        translationBuilder.add(ModItems.copper_pickaxe,"铜镐");
        translationBuilder.add(ModItems.copper_axe,"铜斧");
        translationBuilder.add(ModItems.copper_shovel,"铜铲");
        translationBuilder.add(ModItems.copper_hoe,"铜锄");

        translationBuilder.add(ModItems.blue_copper_helmet,"染色铜制头盔");
        translationBuilder.add(ModItems.blue_copper_chestplate,"染色铜制胸甲");
        translationBuilder.add(ModItems.blue_copper_leggings,"染色铜制护腿");
        translationBuilder.add(ModItems.blue_copper_boots,"染色铜制靴子");


//        花
        translationBuilder.add(ModBlocks.Forever_Summer,"无尽夏");


//        食物
        translationBuilder.add(ModItems.cook_corn,"烤玉米");
        translationBuilder.add(ModItems.rice,"米饭");
        translationBuilder.add(ModItems.cook_parsnips,"烤防风草");
        translationBuilder.add(ModItems.cook_scallion,"烤韭葱");
        translationBuilder.add(ModItems.cook_egg,"煎鸡蛋");
        translationBuilder.add(ModItems.cook_tomato,"烤西红柿");


//        合成食物
        translationBuilder.add(ModItems.pizza,"披萨");
        translationBuilder.add(ModItems.blueberry_cobbler,"蓝莓馅饼");
        translationBuilder.add(ModItems.hamburger,"汉堡包");
        translationBuilder.add(ModItems.salad,"沙拉");
        translationBuilder.add(ModItems.pudding,"布丁");

//      合成甲片
        translationBuilder.add(ModItems.wooden_plate,"加固木片");
        translationBuilder.add(ModItems.stone_plate,"加固石片");
        translationBuilder.add(ModItems.chainmail_plate,"锁链甲片");

        translationBuilder.add(ModItemGroups.ITEM_NAME, "原版拓展物品");
        translationBuilder.add(ModItemGroups.BUILD_NAME, "原版拓展建筑方块");
        translationBuilder.add("entity.minecraft.villager.cook_man","甜品师");


//        铜
        translationBuilder.add(ModBlocks.copper_stairs, "铜制楼梯");
        translationBuilder.add(ModBlocks.copper_slab, "铜制半砖");
        translationBuilder.add(ModBlocks.copper_button, "铜制按钮");
        translationBuilder.add(ModBlocks.copper_pressure_plate, "铜制压力板");
        translationBuilder.add(ModBlocks.copper_fence, "铜制栅栏");
        translationBuilder.add(ModBlocks.copper_fence_gate, "铜制栅栏门");
        translationBuilder.add(ModBlocks.copper_wall, "铜制围墙");
        translationBuilder.add(ModBlocks.copper_door, "铜制门");
        translationBuilder.add(ModBlocks.copper_trapdoor, "铜制活板门");

        //        铁
        translationBuilder.add(ModBlocks.iron_stairs, "铁楼梯");
        translationBuilder.add(ModBlocks.iron_slab, "铁半砖");
        translationBuilder.add(ModBlocks.iron_button, "铁按钮");
        translationBuilder.add(ModBlocks.iron_fence, "铁栅栏");
        translationBuilder.add(ModBlocks.iron_fence_gate, "铁栅栏门");
        translationBuilder.add(ModBlocks.iron_wall, "铁围墙");

        //        黄金
        translationBuilder.add(ModBlocks.gold_stairs, "金楼梯");
        translationBuilder.add(ModBlocks.gold_slab, "金半砖");
        translationBuilder.add(ModBlocks.gold_button, "金按钮");
        translationBuilder.add(ModBlocks.gold_fence, "金栅栏");
        translationBuilder.add(ModBlocks.gold_fence_gate, "金栅栏门");
        translationBuilder.add(ModBlocks.gold_wall, "金围墙");
        translationBuilder.add(ModBlocks.gold_door, "金门");
        translationBuilder.add(ModBlocks.gold_trapdoor, "金活板门");

        //        钻石
        translationBuilder.add(ModBlocks.diamond_stairs, "钻石楼梯");
        translationBuilder.add(ModBlocks.diamond_slab, "钻石半砖");
        translationBuilder.add(ModBlocks.diamond_button, "钻石按钮");
        translationBuilder.add(ModBlocks.diamond_pressure_plate, "钻石压力板");
        translationBuilder.add(ModBlocks.diamond_fence, "钻石栅栏");
        translationBuilder.add(ModBlocks.diamond_fence_gate, "钻石栅栏门");
        translationBuilder.add(ModBlocks.diamond_wall, "钻石围墙");
        translationBuilder.add(ModBlocks.diamond_door, "钻石门");
        translationBuilder.add(ModBlocks.diamond_trapdoor, "钻石活板门");

        //        绿宝石
        translationBuilder.add(ModBlocks.emerald_stairs, "绿宝石楼梯");
        translationBuilder.add(ModBlocks.emerald_slab, "绿宝石半砖");
        translationBuilder.add(ModBlocks.emerald_button, "绿宝石按钮");
        translationBuilder.add(ModBlocks.emerald_pressure_plate, "绿宝石压力板");
        translationBuilder.add(ModBlocks.emerald_fence, "绿宝石栅栏");
        translationBuilder.add(ModBlocks.emerald_fence_gate, "绿宝石栅栏门");
        translationBuilder.add(ModBlocks.emerald_wall, "绿宝石围墙");
        translationBuilder.add(ModBlocks.emerald_door, "绿宝石门");
        translationBuilder.add(ModBlocks.emerald_trapdoor, "绿宝石活板门");



    }
}

package com.myvillager.item;

import com.myvillager.MyVillageMod;
import com.myvillager.block.ModBlocks;
import com.myvillager.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
//    添加一个物品id为银silver的物品
    public static final Item amethyst_ingot = registerItem("amethyst_ingot",new Item(new FabricItemSettings()));
//    金刚石
    public static final Item adamas = registerItem("adamas",new Item(new FabricItemSettings()));
//    红宝石
    public static final Item ruby = registerItem("ruby",new Item(new FabricItemSettings()));

//    西红柿
    public static final Item tomato = registerItem("tomato",new Item(new FabricItemSettings().
        food(ModFoodComponents.tomato)));

    public static final Item tomato_seeds = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.tomato_crop,
                    new FabricItemSettings()));


//    青苹果
    public static final Item green_apple = registerItem("green_apple",new Item(new FabricItemSettings().
        food(ModFoodComponents.green_apple)));

//茄子
    public static final Item eggplant = registerItem("eggplant",new Item(new FabricItemSettings().
            food(ModFoodComponents.eggplant)));
    public static final Item eggplant_seeds = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.eggplant_crop,
                    new FabricItemSettings()));

//白菜
    public static final Item cabbage = registerItem("cabbage",new Item(new FabricItemSettings().
            food(ModFoodComponents.cabbage)));
    public static final Item cabbage_seeds = registerItem("cabbage_seeds",
            new AliasedBlockItem(ModBlocks.cabbage_crop,
                    new FabricItemSettings()));

//    蓝莓
    public static final Item blueberry = registerItem("blueberry",new Item(new FabricItemSettings().
        food(ModFoodComponents.blueberry)));
    public static final Item blueberry_seeds = registerItem("blueberry_seeds",
            new AliasedBlockItem(ModBlocks.blueberry_crop,
                    new FabricItemSettings()));
//    韭葱
    public static final Item scallion = registerItem("scallion",new Item(new FabricItemSettings().
        food(ModFoodComponents.scallion)));
    public static final Item scallion_seeds = registerItem("scallion_seeds",
            new AliasedBlockItem(ModBlocks.scallion_crop,
                    new FabricItemSettings()));


//    水稻
    public static final Item paddy = registerItem("paddy",new Item(new FabricItemSettings().
        food(ModFoodComponents.paddy)));
    public static final Item paddy_seeds = registerItem("paddy_seeds",
            new AliasedBlockItem(ModBlocks.paddy_crop,
                    new FabricItemSettings()));


//    菠萝
    public static final Item pineapple = registerItem("pineapple",new Item(new FabricItemSettings().
        food(ModFoodComponents.pineapple)));
    public static final Item pineapple_seeds = registerItem("pineapple_seeds",
            new AliasedBlockItem(ModBlocks.pineapple_crop,
                    new FabricItemSettings()));
//    防风草
    public static final Item parsnips = registerItem("parsnips",new Item(new FabricItemSettings().
        food(ModFoodComponents.parsnips)));
    public static final Item parsnips_seeds = registerItem("parsnips_seeds",
            new AliasedBlockItem(ModBlocks.parsnips_crop,
                    new FabricItemSettings()));


//    草莓
    public static final Item stawberry = registerItem("stawberry",new Item(new FabricItemSettings().
        food(ModFoodComponents.stawberry)));
    public static final Item stawberry_seeds = registerItem("stawberry_seeds",
            new AliasedBlockItem(ModBlocks.stawberry_crop,
                    new FabricItemSettings()));

//     玉米
    public static final Item corn = registerItem("corn",new Item(new FabricItemSettings().
        food(ModFoodComponents.corn)));
    public static final Item corn_seeds = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.corn_crop,
                    new FabricItemSettings()));




//    单一烤熟

    public static final Item raw_egg = registerItem("raw_egg",new Item(new FabricItemSettings().
            food(ModFoodComponents.raw_egg)));
    public static final Item cook_egg = registerItem("cook_egg",new Item(new FabricItemSettings().
        food(ModFoodComponents.cook_egg)));
    public static final Item cook_tomato = registerItem("cook_tomato",new Item(new FabricItemSettings().
        food(ModFoodComponents.cook_tomato)));

    public static final Item cook_corn = registerItem("cook_corn",new Item(new FabricItemSettings().
            food(ModFoodComponents.cook_corn)));

    public static final Item cook_parsnips = registerItem("cook_parsnips",new Item(new FabricItemSettings().
            food(ModFoodComponents.cook_parsnips)));

    public static final Item rice = registerItem("rice",new Item(new FabricItemSettings().
            food(ModFoodComponents.rice)));

    public static final Item cook_scallion = registerItem("cook_scallion",new Item(new FabricItemSettings().
            food(ModFoodComponents.cook_scallion)));

//    蜂窝煤
    public static final Item honeycomb_briquette = registerItem("honeycomb_briquette",new Item(new FabricItemSettings()));


//    金属探测器
//    public static final Item metal_detector = registerItem("metal_detector",
//        new MetalDetectorItem(new FabricItemSettings().maxDamage(128)));

    //    木头盔甲
    public static final Item wooden_helmet = registerItem("wooden_helmet",
            new ArmorItem(ModArmorMaterials.Wooden, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item wooden_chestplate = registerItem("wooden_chestplate",
            new ArmorItem(ModArmorMaterials.Wooden, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item wooden_leggings = registerItem("wooden_leggings",
            new ArmorItem(ModArmorMaterials.Wooden, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item wooden_boots = registerItem("wooden_boots",
            new ArmorItem(ModArmorMaterials.Wooden, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //    石头盔甲
    public static final Item stone_helmet = registerItem("stone_helmet",
            new ArmorItem(ModArmorMaterials.Stone, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item stone_chestplate = registerItem("stone_chestplate",
            new ArmorItem(ModArmorMaterials.Stone, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item stone_leggings = registerItem("stone_leggings",
            new ArmorItem(ModArmorMaterials.Stone, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item stone_boots = registerItem("stone_boots",
            new ArmorItem(ModArmorMaterials.Stone, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //    紫水晶盔甲
    public static final Item amethyst_helmet = registerItem("amethyst_helmet",
            new ArmorItem(ModArmorMaterials.Amethyst, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item amethyst_chestplate = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.Amethyst, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item amethyst_leggings = registerItem("amethyst_leggings",
            new ArmorItem(ModArmorMaterials.Amethyst, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item amethyst_boots = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.Amethyst, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //紫水晶工具
    public static final Item amethyst_sword = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterial.amethyst, 4, -2.4f, new FabricItemSettings()));
    public static final Item amethyst_pickaxe = registerItem("amethyst_pickaxe",
            new PickaxeItem(ModToolMaterial.amethyst, 3, -2.8f, new FabricItemSettings()));
    public static final Item amethyst_shovel = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterial.amethyst, 1, -3f, new FabricItemSettings()));
    public static final Item amethyst_axe = registerItem("amethyst_axe",
            new AxeItem(ModToolMaterial.amethyst, 7, -3f, new FabricItemSettings()));
    public static final Item amethyst_hoe= registerItem("amethyst_hoe",
            new HoeItem(ModToolMaterial.amethyst, -4, 0f, new FabricItemSettings()));


    //    红宝石盔甲
    public static final Item ruby_helmet = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.Ruby, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ruby_chestplate = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.Ruby, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ruby_leggings = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.Ruby, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ruby_boots = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.Ruby, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //红宝石工具
    public static final Item ruby_sword = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.ruby, 4, -2.4f, new FabricItemSettings()));
    public static final Item ruby_pickaxe = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.ruby, 3, -2.8f, new FabricItemSettings()));
    public static final Item ruby_shovel = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.ruby, 1, -3f, new FabricItemSettings()));
    public static final Item ruby_axe = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.ruby, 7, -3f, new FabricItemSettings()));
    public static final Item ruby_hoe= registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.ruby, -4, 0f, new FabricItemSettings()));


//    绿宝石盔甲
    public static final Item emerald_helmet = registerItem("emerald_helmet",
        new ArmorItem(ModArmorMaterials.Emerald, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item emerald_chestplate = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.Emerald, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item emerald_leggings = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.Emerald, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item emerald_boots = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.Emerald, ArmorItem.Type.BOOTS, new FabricItemSettings()));
//绿宝石工具
    public static final Item emerald_sword = registerItem("emerald_sword",
        new SwordItem(ModToolMaterial.emerald, 3, -2.4f, new FabricItemSettings()));
    public static final Item emerald_pickaxe = registerItem("emerald_pickaxe",
            new PickaxeItem(ModToolMaterial.emerald, 2, -2.8f, new FabricItemSettings()));
    public static final Item emerald_shovel = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterial.emerald, 0, -3f, new FabricItemSettings()));
    public static final Item emerald_axe = registerItem("emerald_axe",
            new AxeItem(ModToolMaterial.emerald, 6, -3f, new FabricItemSettings()));
    public static final Item emerald_hoe= registerItem("emerald_hoe",
            new HoeItem(ModToolMaterial.emerald, -3, 0f, new FabricItemSettings()));


    //    铜制式盔甲
    public static final Item copper_helmet = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.Copper, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item copper_chestplate = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.Copper, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item copper_leggings = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.Copper, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item copper_boots = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.Copper, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //    青金石铜制式盔甲
    public static final Item blue_copper_helmet = registerItem("blue_copper_helmet",
            new ArmorItem(ModArmorMaterials.Lapis_Lazuli_Copper, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item blue_copper_chestplate = registerItem("blue_copper_chestplate",
            new ArmorItem(ModArmorMaterials.Lapis_Lazuli_Copper, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item blue_copper_leggings = registerItem("blue_copper_leggings",
            new ArmorItem(ModArmorMaterials.Lapis_Lazuli_Copper, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item blue_copper_boots = registerItem("blue_copper_boots",
            new ArmorItem(ModArmorMaterials.Lapis_Lazuli_Copper, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    //铜工具
    public static final Item copper_sword = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.copper, 3, -2.6f, new FabricItemSettings()));
    public static final Item copper_pickaxe = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.copper, 1, -2.8f, new FabricItemSettings()));
    public static final Item copper_shovel = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.copper, 2, -3f, new FabricItemSettings()));
    public static final Item copper_axe = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.copper, 4, -3f, new FabricItemSettings()));
    public static final Item copper_hoe= registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.copper, -1, 0f, new FabricItemSettings()));

//合成食物
    public static final Item pizza = registerItem("pizza",new Item(new FabricItemSettings()
        .food(ModFoodComponents.pizza)));

    public static final Item blueberry_cobbler = registerItem("blueberry_cobbler",new Item(new FabricItemSettings()
            .food(ModFoodComponents.blueberry_cobbler)));

    public static final Item hamburger = registerItem("hamburger",new Item(new FabricItemSettings()
            .food(ModFoodComponents.hamburger)));

    public static final Item salad = registerItem("salad",new Item(new FabricItemSettings()
            .food(ModFoodComponents.salad)));

    public static final Item pudding = registerItem("pudding",new Item(new FabricItemSettings()
            .food(ModFoodComponents.pudding)));




//    合成甲片
    public static final Item wooden_plate = registerItem("wooden_plate",new Item(new FabricItemSettings()));
    public static final Item stone_plate = registerItem("stone_plate",new Item(new FabricItemSettings()));
    public static final Item chainmail_plate = registerItem("chainmail_plate",new Item(new FabricItemSettings()));

//    添加物品
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
//        entries.add(silver);
//        entries.add(adamas);
    }
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(MyVillageMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        MyVillageMod.LOGGER.info("Registering Mod Items for" + MyVillageMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}

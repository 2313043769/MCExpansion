package com.myvillager.datagen;

import com.myvillager.block.ModBlocks;
import com.myvillager.item.ModItems;
import com.myvillager.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
//    可被燃烧的银矿组
//    private static List<ItemConvertible> silver_smeltable = List.of(
//            ModBlocks.silver_ore,ModBlocks.deepslate_silver_ore,
//            ModBlocks.nether_silver_ore,ModBlocks.end_silver_ore);

//
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.ruby,
                RecipeCategory.DECORATIONS,ModBlocks.ruby_block);


//        铜制工具合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_sword,1)
                .pattern("a")
                .pattern("a")
                .pattern("b")
                .input('a', Items.COPPER_INGOT)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_axe,1)
                .pattern("aa")
                .pattern("ab")
                .pattern(" b")
                .input('a', Items.COPPER_INGOT)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_pickaxe,1)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', Items.COPPER_INGOT)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_shovel,1)
                .pattern("a")
                .pattern("b")
                .pattern("b")
                .input('a', Items.COPPER_INGOT)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_hoe,1)
                .pattern("aa")
                .pattern(" b")
                .pattern(" b")
                .input('a', Items.COPPER_INGOT)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_hoe)));

//        铜套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_helmet,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_chestplate,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_leggings,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.copper_boots,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.copper_boots)));

        //        青金石铜套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.blue_copper_helmet,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('s', Items.LAPIS_LAZULI)
                .input('a', ModItems.copper_helmet)
                .criterion(hasItem(Items.LAPIS_LAZULI),conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.blue_copper_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.blue_copper_chestplate,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('s', Items.LAPIS_LAZULI)
                .input('a', ModItems.copper_chestplate)
                .criterion(hasItem(Items.LAPIS_LAZULI),conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.blue_copper_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.blue_copper_leggings,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('s', Items.LAPIS_LAZULI)
                .input('a', ModItems.copper_leggings)
                .criterion(hasItem(Items.LAPIS_LAZULI),conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.blue_copper_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.blue_copper_boots,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('s', Items.LAPIS_LAZULI)
                .input('a', ModItems.copper_boots)
                .criterion(hasItem(Items.LAPIS_LAZULI),conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.blue_copper_boots)));

//        绿宝石套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_helmet,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_chestplate,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_leggings,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_boots,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_boots)));

        //        绿宝石工具合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_sword,1)
                .pattern("a")
                .pattern("a")
                .pattern("b")
                .input('a', Items.EMERALD)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_axe,1)
                .pattern("aa")
                .pattern("ab")
                .pattern(" b")
                .input('a', Items.EMERALD)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_pickaxe,1)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', Items.EMERALD)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_shovel,1)
                .pattern("a")
                .pattern("b")
                .pattern("b")
                .input('a', Items.EMERALD)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.emerald_hoe,1)
                .pattern("aa")
                .pattern(" b")
                .pattern(" b")
                .input('a', Items.EMERALD)
                .input('b', Items.STICK)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.emerald_hoe)));



        //        木套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.wooden_helmet,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', ModItems.wooden_plate)
                .criterion(hasItem(ModItems.wooden_plate),conditionsFromItem(ModItems.wooden_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.wooden_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.wooden_chestplate,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', ModItems.wooden_plate)
                .criterion(hasItem(ModItems.wooden_plate),conditionsFromItem(ModItems.wooden_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.wooden_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.wooden_leggings,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.wooden_plate)
                .criterion(hasItem(ModItems.wooden_plate),conditionsFromItem(ModItems.wooden_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.wooden_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.wooden_boots,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.wooden_plate)
                .criterion(hasItem(ModItems.wooden_plate),conditionsFromItem(ModItems.wooden_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.wooden_boots)));

        //        石头套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.stone_helmet,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', ModItems.stone_plate)
                .criterion(hasItem(ModItems.stone_plate),conditionsFromItem(ModItems.stone_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.stone_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.stone_chestplate,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', ModItems.stone_plate)
                .criterion(hasItem(ModItems.stone_plate),conditionsFromItem(ModItems.stone_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.stone_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.stone_leggings,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.stone_plate)
                .criterion(hasItem(ModItems.stone_plate),conditionsFromItem(ModItems.stone_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.stone_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.stone_boots,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.stone_plate)
                .criterion(hasItem(ModItems.stone_plate),conditionsFromItem(ModItems.stone_plate))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.stone_boots)));


        //        锁链套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,Items.CHAINMAIL_HELMET,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', ModItems.chainmail_plate)
                .criterion(hasItem(ModItems.chainmail_plate),conditionsFromItem(ModItems.chainmail_plate))
                .offerTo(exporter,new Identifier(getRecipeName(Items.CHAINMAIL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,Items.CHAINMAIL_CHESTPLATE,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', ModItems.chainmail_plate)
                .criterion(hasItem(ModItems.chainmail_plate),conditionsFromItem(ModItems.chainmail_plate))
                .offerTo(exporter,new Identifier(getRecipeName(Items.CHAINMAIL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,Items.CHAINMAIL_LEGGINGS,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.chainmail_plate)
                .criterion(hasItem(ModItems.chainmail_plate),conditionsFromItem(ModItems.chainmail_plate))
                .offerTo(exporter,new Identifier(getRecipeName(Items.CHAINMAIL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,Items.CHAINMAIL_BOOTS,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.chainmail_plate)
                .criterion(hasItem(ModItems.chainmail_plate),conditionsFromItem(ModItems.chainmail_plate))
                .offerTo(exporter,new Identifier(getRecipeName(Items.CHAINMAIL_BOOTS)));

        //        紫水晶套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_helmet,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', ModItems.amethyst_ingot)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_chestplate,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', ModItems.amethyst_ingot)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_leggings,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.amethyst_ingot)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_boots,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.amethyst_ingot)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_boots)));

        //        紫水晶工具合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_sword,1)
                .pattern("a")
                .pattern("a")
                .pattern("b")
                .input('a', ModItems.amethyst_ingot)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_axe,1)
                .pattern("aa")
                .pattern("ab")
                .pattern(" b")
                .input('a', ModItems.amethyst_ingot)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_pickaxe,1)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', ModItems.amethyst_ingot)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_shovel,1)
                .pattern("a")
                .pattern("b")
                .pattern("b")
                .input('a', ModItems.amethyst_ingot)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.amethyst_hoe,1)
                .pattern("aa")
                .pattern(" b")
                .pattern(" b")
                .input('a', ModItems.amethyst_ingot)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.amethyst_ingot),conditionsFromItem(ModItems.amethyst_ingot))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_hoe)));


        //        红宝石套合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_helmet,1)
                .pattern("sss")
                .pattern("s s")
                .input('s', ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_helmet)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_chestplate,1)
                .pattern("s s")
                .pattern("sss")
                .pattern("sss")
                .input('s', ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_chestplate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_leggings,1)
                .pattern("sss")
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_leggings)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_boots,1)
                .pattern("s s")
                .pattern("s s")
                .input('s', ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_boots)));

        //        红宝石工具合成配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_sword,1)
                .pattern("a")
                .pattern("a")
                .pattern("b")
                .input('a', ModItems.ruby)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_axe,1)
                .pattern("aa")
                .pattern("ab")
                .pattern(" b")
                .input('a', ModItems.ruby)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_pickaxe,1)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .input('a', ModItems.ruby)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_shovel,1)
                .pattern("a")
                .pattern("b")
                .pattern("b")
                .input('a', ModItems.ruby)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.ruby_hoe,1)
                .pattern("aa")
                .pattern(" b")
                .pattern(" b")
                .input('a', ModItems.ruby)
                .input('b', Items.STICK)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ruby_hoe)));


        //        合成甲片
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.chainmail_plate,2)
                .pattern("aa")
                .pattern("aa")
                .input('a', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET),conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.chainmail_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.stone_plate,4)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .input('a', Items.COBBLESTONE)
                .input('b', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.stone_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.wooden_plate,2)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .input('a', Ingredient.fromTag(ItemTags.LOGS))
                .input('b', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.wooden_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.amethyst_ingot,2)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .input('a', Blocks.AMETHYST_BLOCK)
                .input('b', Items.EMERALD)
                .criterion(hasItem(Blocks.AMETHYST_BLOCK),conditionsFromItem(Blocks.AMETHYST_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.amethyst_ingot)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.ruby,1)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .input('a', Items.REDSTONE)
                .input('b', Items.EMERALD)
                .criterion(hasItem(Items.REDSTONE),conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter,new Identifier("emerald_become_ruby"));

//        原版追加配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.SADDLE,1)
                .pattern("aaa")
                .pattern("s s")
                .input('s', Items.IRON_INGOT)
                .input('a', Items.LEATHER)
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_leather", conditionsFromItem(Items.LEATHER))
                .offerTo(exporter,new Identifier(getRecipeName(Items.SADDLE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,Items.ENCHANTED_GOLDEN_APPLE,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('a', Items.GOLDEN_APPLE)
                .input('s', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK),conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(Items.ENCHANTED_GOLDEN_APPLE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.raw_egg,1)
                .input(Items.EGG)
                .criterion(hasItem(Items.EGG),conditionsFromItem(Items.EGG))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.raw_egg)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.honeycomb_briquette,3)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('a', Items.WATER_BUCKET)
                .input('s', Ingredient.ofItems(
                        Items.COAL,
                        Items.CHARCOAL
                ))
                .criterion(hasItem(Items.COAL),conditionsFromItem(Items.COAL))
                .criterion(hasItem(Items.CHARCOAL),conditionsFromItem(Items.CHARCOAL))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.honeycomb_briquette)));



//        烹饪配方
        RecipeProvider.offerSmelting(exporter,List.of(ModItems.corn),
                RecipeCategory.FOOD,ModItems.cook_corn,0.4f,150,getRecipeName(ModItems.cook_corn));
        RecipeProvider.offerSmelting(exporter,List.of(ModItems.paddy),
                RecipeCategory.FOOD,ModItems.rice,0.4f,150,getRecipeName(ModItems.rice));
        RecipeProvider.offerSmelting(exporter,List.of(ModItems.scallion),
                RecipeCategory.FOOD,ModItems.cook_scallion,0.4f,150,getRecipeName(ModItems.cook_scallion));
        RecipeProvider.offerSmelting(exporter,List.of(ModItems.parsnips),
                RecipeCategory.FOOD,ModItems.cook_parsnips,0.4f,150,getRecipeName(ModItems.cook_parsnips));
        RecipeProvider.offerSmelting(exporter,List.of(ModItems.raw_egg),
                RecipeCategory.FOOD,ModItems.cook_egg,0.4f,200,getRecipeName(ModItems.cook_egg));
        RecipeProvider.offerSmelting(exporter,List.of(ModItems.tomato),
                RecipeCategory.FOOD,ModItems.cook_tomato,0.4f,150,getRecipeName(ModItems.cook_tomato));

        RecipeProvider.offerSmelting(exporter,List.of(Items.ROTTEN_FLESH),
                RecipeCategory.MISC,Items.LEATHER,0.5f,200,getRecipeName(Items.ROTTEN_FLESH));

//合成食物配方

//        披萨
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.pizza,3)
                .pattern("agb")
                .pattern("cde")
                .pattern("fff")
                .input('a', Items.EGG)
                .input('b', Ingredient.ofItems(
                Items.RED_MUSHROOM,
                Items.BROWN_MUSHROOM
                ))
                .input('c', ModItems.tomato)
                .input('d', Items.SUGAR)
                .input('e', ModItems.corn)
                .input('f', Items.WHEAT)
                .input('g', Items.WATER_BUCKET)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(Items.BROWN_MUSHROOM))
                .criterion(hasItem(ModItems.tomato), conditionsFromItem(ModItems.tomato))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.corn), conditionsFromItem(ModItems.corn))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("pizza"));


//        汉堡

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.hamburger,3)
                .pattern(" b ")
                .pattern("wmc")
                .pattern(" b ")
                .input('b', Items.BREAD)
                .input('w', ModItems.cabbage)
                .input('m', Ingredient.ofItems(
                        Items.COOKED_RABBIT,
                        Items.COOKED_MUTTON,
                        Items.COOKED_CHICKEN,
                        Items.COOKED_BEEF,
                        Items.COOKED_PORKCHOP
                ))
                .input('c', ModItems.corn)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(ModItems.cabbage), conditionsFromItem(ModItems.cabbage))
                .criterion(hasItem(Items.COOKED_MUTTON), conditionsFromItem(Items.COOKED_MUTTON))
                .criterion(hasItem(ModItems.corn), conditionsFromItem(ModItems.corn))
                .offerTo(exporter, new Identifier("hamburger"));


//        蓝莓馅饼
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.blueberry_cobbler,3)
                .pattern(" b ")
                .pattern("wmw")
                .input('b', ModItems.blueberry)
                .input('w', Items.WHEAT)
                .input('m', Items.EGG)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(ModItems.blueberry), conditionsFromItem(ModItems.blueberry))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier("blueberry_cobbler"));

//          沙拉
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.salad,3)
                .pattern("mmm")
                .pattern("mmm")
                .pattern(" b ")
                .input('b', Items.BOWL)
                .input('m', Ingredient.ofItems(
                        Items.GLOW_BERRIES,
                        Items.CARROT,
                        Items.POTATO,
                        Items.SWEET_BERRIES,
                        Items.BEETROOT,
                        Items.MELON_SLICE,
                        ModItems.blueberry,
                        ModItems.cabbage,
                        ModItems.scallion,
                        ModItems.parsnips,
                        ModItems.pineapple,
                        ModItems.green_apple,
                        ModItems.stawberry,
                        ModItems.corn,
                        ModItems.tomato
                ))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                .criterion(hasItem(ModItems.blueberry), conditionsFromItem(ModItems.blueberry))
                .criterion(hasItem(ModItems.cabbage), conditionsFromItem(ModItems.cabbage))
                .criterion(hasItem(ModItems.scallion), conditionsFromItem(ModItems.scallion))
                .criterion(hasItem(ModItems.parsnips), conditionsFromItem(ModItems.parsnips))
                .criterion(hasItem(ModItems.pineapple), conditionsFromItem(ModItems.pineapple))
                .criterion(hasItem(ModItems.green_apple), conditionsFromItem(ModItems.green_apple))
                .criterion(hasItem(ModItems.stawberry), conditionsFromItem(ModItems.stawberry))
                .criterion(hasItem(ModItems.corn), conditionsFromItem(ModItems.corn))
                .criterion(hasItem(ModItems.tomato), conditionsFromItem(ModItems.tomato))
                .offerTo(exporter, new Identifier("salad"));


//        布丁
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.pudding,3)
                .pattern("mbw")
                .pattern(" p ")
                .pattern(" s ")
                .input('b', Ingredient.ofItems(
                        ModItems.blueberry,
                        Items.SWEET_BERRIES,
                        Items.GLOW_BERRIES
                ))
                .input('w', Items.WATER_BUCKET)
                .input('m', Items.MILK_BUCKET)
                .input('p', ModItems.paddy)
                .input('s', Items.BOWL)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(ModItems.blueberry), conditionsFromItem(ModItems.blueberry))
                .criterion(hasItem(ModItems.paddy), conditionsFromItem(ModItems.paddy))
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier("pudding"));




//        建筑方块配方
//        红蓝宝石灯
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_lamp_block,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('a', Blocks.REDSTONE_LAMP)
                .input('s', ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_lamp_block)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.adamas_lamp_block,1)
                .pattern(" s ")
                .pattern("sas")
                .pattern(" s ")
                .input('a', Blocks.REDSTONE_LAMP)
                .input('s', Items.LAPIS_LAZULI)
                .criterion(hasItem(Items.LAPIS_LAZULI),conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.adamas_lamp_block)));


//        铜
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_trapdoor,1)
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_trapdoor)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_door,1)
                .pattern("ss")
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_door)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_pressure_plate,1)
                .pattern("ss")
                .input('s', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_pressure_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_slab,6)
                .pattern("sss")
                .input('s', Blocks.COPPER_BLOCK)
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_slab)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_wall,6)
                .pattern("sss")
                .pattern("sss")
                .input('s', Blocks.COPPER_BLOCK)
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_wall)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_fence_gate,1)
                .pattern("asa")
                .pattern("asa")
                .input('s', Blocks.COPPER_BLOCK)
                .input('a', Items.COPPER_INGOT)
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(Blocks.COPPER_BLOCK))
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_fence_gate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_fence,3)
                .pattern("sas")
                .pattern("sas")
                .input('s', Blocks.COPPER_BLOCK)
                .input('a', Items.COPPER_INGOT)
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(Blocks.COPPER_BLOCK))
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_fence)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_stairs,4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .input('s', Blocks.COPPER_BLOCK)
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_stairs)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.copper_button,1)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.copper_button)));

        //        铁
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.iron_slab,6)
                .pattern("sss")
                .input('s', Blocks.IRON_BLOCK)
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(Blocks.IRON_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.iron_slab)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.iron_wall,6)
                .pattern("sss")
                .pattern("sss")
                .input('s', Blocks.IRON_BLOCK)
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(Blocks.IRON_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.iron_wall)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.iron_fence_gate,1)
                .pattern("asa")
                .pattern("asa")
                .input('s', Blocks.IRON_BLOCK)
                .input('a', Items.IRON_INGOT)
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.iron_fence_gate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.iron_fence,3)
                .pattern("sas")
                .pattern("sas")
                .input('s', Blocks.IRON_BLOCK)
                .input('a', Items.IRON_INGOT)
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.iron_fence)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.iron_stairs,4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .input('s', Blocks.IRON_BLOCK)
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(Blocks.IRON_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.iron_stairs)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.iron_button,1)
                .input(Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.iron_button)));

        //        金
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_trapdoor,1)
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_trapdoor)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_door,1)
                .pattern("ss")
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_door)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_slab,6)
                .pattern("sss")
                .input('s', Blocks.GOLD_BLOCK)
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(Blocks.GOLD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_slab)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_wall,6)
                .pattern("sss")
                .pattern("sss")
                .input('s', Blocks.GOLD_BLOCK)
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(Blocks.GOLD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_wall)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_fence_gate,1)
                .pattern("asa")
                .pattern("asa")
                .input('s', Blocks.GOLD_BLOCK)
                .input('a', Items.GOLD_INGOT)
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(Blocks.GOLD_BLOCK))
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_fence_gate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_fence,3)
                .pattern("sas")
                .pattern("sas")
                .input('s', Blocks.GOLD_BLOCK)
                .input('a', Items.GOLD_INGOT)
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(Blocks.GOLD_BLOCK))
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_fence)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_stairs,4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .input('s', Blocks.GOLD_BLOCK)
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(Blocks.GOLD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_stairs)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.gold_button,1)
                .input(Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.gold_button)));

        //        钻石
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_trapdoor,1)
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_trapdoor)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_door,1)
                .pattern("ss")
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_door)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_pressure_plate,1)
                .pattern("ss")
                .input('s', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_pressure_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_slab,6)
                .pattern("sss")
                .input('s', Blocks.DIAMOND_BLOCK)
                .criterion(hasItem(Blocks.DIAMOND_BLOCK),conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_slab)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_wall,6)
                .pattern("sss")
                .pattern("sss")
                .input('s', Blocks.DIAMOND_BLOCK)
                .criterion(hasItem(Blocks.DIAMOND_BLOCK),conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_wall)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_fence_gate,1)
                .pattern("asa")
                .pattern("asa")
                .input('s', Blocks.DIAMOND_BLOCK)
                .input('a', Items.DIAMOND)
                .criterion(hasItem(Blocks.DIAMOND_BLOCK),conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_fence_gate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_fence,3)
                .pattern("sas")
                .pattern("sas")
                .input('s', Blocks.DIAMOND_BLOCK)
                .input('a', Items.DIAMOND)
                .criterion(hasItem(Blocks.DIAMOND_BLOCK),conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_fence)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_stairs,4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .input('s', Blocks.DIAMOND_BLOCK)
                .criterion(hasItem(Blocks.DIAMOND_BLOCK),conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_stairs)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.diamond_button,1)
                .input(Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.diamond_button)));

        //        绿宝石
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_trapdoor,1)
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_trapdoor)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_door,1)
                .pattern("ss")
                .pattern("ss")
                .pattern("ss")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_door)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_pressure_plate,1)
                .pattern("ss")
                .input('s', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_pressure_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_slab,6)
                .pattern("sss")
                .input('s', Blocks.EMERALD_BLOCK)
                .criterion(hasItem(Blocks.EMERALD_BLOCK),conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_slab)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_wall,6)
                .pattern("sss")
                .pattern("sss")
                .input('s', Blocks.EMERALD_BLOCK)
                .criterion(hasItem(Blocks.EMERALD_BLOCK),conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_wall)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_fence_gate,1)
                .pattern("asa")
                .pattern("asa")
                .input('s', Blocks.EMERALD_BLOCK)
                .input('a', Items.EMERALD)
                .criterion(hasItem(Blocks.EMERALD_BLOCK),conditionsFromItem(Blocks.EMERALD_BLOCK))
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_fence_gate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_fence,3)
                .pattern("sas")
                .pattern("sas")
                .input('s', Blocks.EMERALD_BLOCK)
                .input('a', Items.EMERALD)
                .criterion(hasItem(Blocks.EMERALD_BLOCK),conditionsFromItem(Blocks.EMERALD_BLOCK))
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_fence)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_stairs,4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .input('s', Blocks.EMERALD_BLOCK)
                .criterion(hasItem(Blocks.EMERALD_BLOCK),conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_stairs)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.emerald_button,1)
                .input(Items.EMERALD)
                .criterion(hasItem(Items.EMERALD),conditionsFromItem(Items.EMERALD))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.emerald_button)));

        //        红宝石
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_pressure_plate,1)
                .pattern("ss")
                .input('s', ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_pressure_plate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_slab,6)
                .pattern("sss")
                .input('s', ModBlocks.ruby_block)
                .criterion(hasItem(ModBlocks.ruby_block),conditionsFromItem(ModBlocks.ruby_block))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_slab)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_wall,6)
                .pattern("sss")
                .pattern("sss")
                .input('s', ModBlocks.ruby_block)
                .criterion(hasItem(ModBlocks.ruby_block),conditionsFromItem(ModBlocks.ruby_block))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_wall)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_fence_gate,1)
                .pattern("asa")
                .pattern("asa")
                .input('s', ModBlocks.ruby_block)
                .input('a', ModItems.ruby)
                .criterion(hasItem(ModBlocks.ruby_block),conditionsFromItem(ModBlocks.ruby_block))
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_fence_gate)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_fence,3)
                .pattern("sas")
                .pattern("sas")
                .input('s', ModBlocks.ruby_block)
                .input('a', ModItems.ruby)
                .criterion(hasItem(ModBlocks.ruby_block),conditionsFromItem(ModBlocks.ruby_block))
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_fence)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_stairs,4)
                .pattern("s  ")
                .pattern("ss ")
                .pattern("sss")
                .input('s', ModBlocks.ruby_block)
                .criterion(hasItem(ModBlocks.ruby_block),conditionsFromItem(ModBlocks.ruby_block))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_stairs)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ruby_button,1)
                .input(ModItems.ruby)
                .criterion(hasItem(ModItems.ruby),conditionsFromItem(ModItems.ruby))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ruby_button)));

    }
}

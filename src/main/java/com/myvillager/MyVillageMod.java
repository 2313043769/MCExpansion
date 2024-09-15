package com.myvillager;

import com.myvillager.block.ModBlocks;
import com.myvillager.block.ModFlammableBlockRegistry;
import com.myvillager.item.ModItemGroups;
import com.myvillager.item.ModItems;
import com.myvillager.paiting.ModPaintings;
import com.myvillager.util.ModLootTableModifies;
import com.myvillager.villager.ModVillagers;
//import com.myvillager.world.gen.ModWorldGeneration;
import com.myvillager.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyVillageMod implements ModInitializer {
	public static final String MOD_ID = "myvillage";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
//		物品组注册
		ModItemGroups.registerItemGroups();
//		物品注册
		ModItems.registerModItems();
//		方块注册
		ModBlocks.registerModBlocks();
//		村民注册
//		ModVillagers.registerVillagers();
//		交易注册
		ModVillagers.registerTrades();
//		画作注册
		ModPaintings.registerPaintings();

//		燃料注册
		FuelRegistry.INSTANCE.add(ModItems.honeycomb_briquette,3200);

		ModLootTableModifies.modifyLootTables();
//		树生成
//		ModWorldGeneration.generateModWorldGen();
//		ModFlammableBlockRegistry.registerFlammableBlocks();
//		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG,ModBlocks.STRIPPED_RED_MAPLE_LOG);
//		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD,ModBlocks.STRIPPED_RED_MAPLE_WOOD);


	}
}
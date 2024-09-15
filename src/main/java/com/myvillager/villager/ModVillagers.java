package com.myvillager.villager;

import com.google.common.collect.ImmutableSet;
import com.myvillager.MyVillageMod;
import com.myvillager.item.ModItems;
import com.myvillager.util.ModTags;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
//    设置工作方块
    public static final PointOfInterestType COOK_POI = registerPOI("cook_poi", Blocks.FURNACE);
//    设置职业
    public static final VillagerProfession COOK_MAN = registerProfession("cook_man",
            RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE,new Identifier(MyVillageMod.MOD_ID,"cook_poi")));




//注册村民方法
    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION,new Identifier(MyVillageMod.MOD_ID,name),
                VillagerProfessionBuilder.create().id(new Identifier(MyVillageMod.MOD_ID,name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }
//    注册村民方块
    public static PointOfInterestType registerPOI(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(MyVillageMod.MOD_ID,name),
                1,1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers(){
        MyVillageMod.LOGGER.info("已为模组注册了村民：" + MyVillageMod.MOD_ID);
    }

    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers(COOK_MAN,1,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD,3),
                    new ItemStack(ModItems.tomato),
                    6,2,0.02f
            ));
                });
    }
}

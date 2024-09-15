package com.myvillager.datagen;

import com.myvillager.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class
ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.emerald_helmet,
                        ModItems.emerald_chestplate,
                        ModItems.emerald_leggings,
                        ModItems.emerald_boots,

                        ModItems.copper_helmet,
                        ModItems.copper_chestplate,
                        ModItems.copper_leggings,
                        ModItems.copper_boots,

                        ModItems.blue_copper_helmet,
                        ModItems.blue_copper_chestplate,
                        ModItems.blue_copper_leggings,
                        ModItems.blue_copper_boots,

                        ModItems.ruby_helmet,
                        ModItems.ruby_chestplate,
                        ModItems.ruby_leggings,
                        ModItems.ruby_boots,

                        ModItems.wooden_helmet,
                        ModItems.wooden_chestplate,
                        ModItems.wooden_leggings,
                        ModItems.wooden_boots,

                        ModItems.stone_helmet,
                        ModItems.stone_chestplate,
                        ModItems.stone_leggings,
                        ModItems.stone_boots,

                        ModItems.amethyst_helmet,
                        ModItems.amethyst_chestplate,
                        ModItems.amethyst_leggings,
                        ModItems.amethyst_boots
                );
    }
}

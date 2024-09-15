package com.myvillager.datagen;

import com.myvillager.datagen.provider.PaintingTagProvider;
import com.myvillager.paiting.ModPaintings;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PaintingVariantTags;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantGenerator extends PaintingTagProvider {
    public ModPaintingVariantGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE)
                .add(ModPaintings.SUNSET)
                .add(ModPaintings.CAT)
                .add(ModPaintings.SHUN)
                .add(ModPaintings.JI)
                .add(ModPaintings.FU)
                .add(ModPaintings.FA)
                .add(ModPaintings.CUTE_CAT)
                .add(ModPaintings.GHOST)
                .add(ModPaintings.DUNHUANG_DEER)
                .add(ModPaintings.SUNRISE)
                .add(ModPaintings.ROOM)
                .add(ModPaintings.FIREWORKS)
                .add(ModPaintings.FORSET);
    }
}

package com.myvillager.world.feature;

import com.myvillager.MyVillageMod;
import com.myvillager.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;


import java.util.List;


public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RUBY_PLACE_ORE_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_MAPLE_PLACED_KEY = registerKey("red_maple_place");
    public static final RegistryKey<PlacedFeature> RUBY_GEODE_PLACED = registerKey("ruby_geode_place");
    public static final RegistryKey<PlacedFeature> BUTTERCUPS_PLACED = registerKey("buttercups_placed");

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MyVillageMod.MOD_ID,name));
    }

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // 在可以存货树的位置生成树，数量，额外的概率，额外的数量。
//        register(context,RED_MAPLE_PLACED_KEY,registryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_MAPLE_KEY),
//                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1,0.1f,2),
//                        ModBlocks.RED_MAPLE_SAPLING));

//        register(context,RUBY_PLACE_ORE_KEY,registryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
//                ModOrePlacement.modifiersWithCount(16,HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(80))));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}


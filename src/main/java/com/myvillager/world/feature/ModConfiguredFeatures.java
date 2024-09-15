package com.myvillager.world.feature;

import com.myvillager.MyVillageMod;
import com.myvillager.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> RED_MAPLE_KEY = registerKey("red_maple");
    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_GEODE = registerKey("ruby_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> BUTTERCUPS_KEY = registerKey("flower_buttercups");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){
//        register(context,RED_MAPLE_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
//                BlockStateProvider.of(ModBlocks.RED_MAPLE_LOG),
//                new StraightTrunkPlacer(5,6,3),//基础高度，第一次随机高度，第二次随机高度。
//                BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES), // 树叶方块
//                new BlobFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(0),4),//树叶的半径，偏差，和高度
//                new TwoLayersFeatureSize(1,0,2)).build());//限制高度 最大把逆境和最小半径。






//        红宝石矿生成逻辑

//        RuleTest stoneReplaceables=  new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
//        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
//
//        List<OreFeatureConfig.Target> overworldRubyOres =
//                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ruby_ore.getDefaultState()),
//                        OreFeatureConfig.createTarget(deepslateReplaceables,ModBlocks.deepslate_ruby_ore.getDefaultState()));

        // 矿脉的多少
//        register(context,RUBY_ORE_KEY,Feature.ORE,new OreFeatureConfig(overworldRubyOres,12));
    }

    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,new Identifier(MyVillageMod.MOD_ID,name));
    }

    private static <FC extends FeatureConfig,F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC cofiguration){
        context.register(key,new ConfiguredFeature<>(feature,cofiguration));
    }
}

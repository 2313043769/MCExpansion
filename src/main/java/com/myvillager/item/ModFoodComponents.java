package com.myvillager.item;

import com.myvillager.item.custom.CustomFoodItem;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent tomato = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,200),0.25f).build();
    public static final FoodComponent green_apple = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
            .build();

    public static final FoodComponent eggplant = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .build();

    public static final FoodComponent cabbage = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .build();

    public static final FoodComponent corn = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f)
            .build();

    public static final FoodComponent blueberry = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f)
            .build();

    public static final FoodComponent paddy = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f)
            .build();
    public static final FoodComponent parsnips = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f)
            .build();
    public static final FoodComponent pineapple = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .build();
    public static final FoodComponent scallion = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .build();

    public static final FoodComponent stawberry = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .build();

//    单一的煮熟
    public static final FoodComponent cook_corn = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f)
        .build();

    public static final FoodComponent rice = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f)
            .build();

    public static final FoodComponent cook_parsnips = new FoodComponent.Builder().hunger(8).saturationModifier(0.6f)
            .build();

    public static final FoodComponent cook_scallion = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f)
            .build();

    public static final FoodComponent cook_tomato = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f)
            .build();

    public static final FoodComponent raw_egg = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f)
            .build();

    public static final FoodComponent cook_egg = new FoodComponent.Builder().hunger(7).saturationModifier(0.4f)
            .build();


//    合成食物
    public static final FoodComponent pizza = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f)
        .alwaysEdible()
        .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,2),1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,200,2),1f)
        .build();

    public static final FoodComponent blueberry_cobbler = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,200,1),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,200,2),1f)
            .build();

    public static final FoodComponent hamburger = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,400,2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,400,1),1f)
            .build();

    public static final FoodComponent salad = new FoodComponent.Builder().hunger(6).saturationModifier(0.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,0),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,1),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,400,0),1f)
            .build();

    public static final FoodComponent pudding = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1,0),1f)
            .build();
}

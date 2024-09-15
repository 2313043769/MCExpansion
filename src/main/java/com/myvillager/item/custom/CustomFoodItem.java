package com.myvillager.item.custom;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

// 自定义食物类
public class CustomFoodItem extends Item {
    private final FoodComponent foodComponent;

    public CustomFoodItem(Settings settings, FoodComponent foodComponent) {
        super(settings.food(foodComponent));
        this.foodComponent = foodComponent;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof PlayerEntity && !((PlayerEntity) user).isCreative()) {
            ((PlayerEntity) user).giveItemStack(new ItemStack(Items.BOWL));
        }
        return new ItemStack(Items.BOWL);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    // 内部 Builder 类
    public static class Builder {
        private int hunger;
        private float saturationModifier;
        private boolean alwaysEdible;
        private final FoodComponent.Builder foodComponentBuilder;

        public Builder() {
            this.foodComponentBuilder = new FoodComponent.Builder();
        }

        public Builder hunger(int hunger) {
            this.hunger = hunger;
            this.foodComponentBuilder.hunger(hunger);
            return this;
        }

        public Builder saturationModifier(float saturationModifier) {
            this.saturationModifier = saturationModifier;
            this.foodComponentBuilder.saturationModifier(saturationModifier);
            return this;
        }

        public Builder alwaysEdible() {
            this.alwaysEdible = true;
            this.foodComponentBuilder.alwaysEdible();
            return this;
        }

        public Builder statusEffect(StatusEffectInstance effect, float chance) {
            this.foodComponentBuilder.statusEffect(effect, chance);
            return this;
        }

        public CustomFoodItem build() {
            FoodComponent foodComponent = this.foodComponentBuilder.build();
            return new CustomFoodItem(new Item.Settings(), foodComponent);
        }
    }
}



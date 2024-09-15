package com.myvillager.item;

import com.myvillager.MyVillageMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    Emerald("emerald",25,new int[] {4,9,6,3},24,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2f,0.1f,
            () -> Ingredient.ofItems(Items.EMERALD)),
    Ruby("ruby",35,new int[] {4,9,6,3},28,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2f,0.1f,
            () -> Ingredient.ofItems(Items.EMERALD)),
    Copper("copper",13,new int[] {2,4,3,2},10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,1f,0f,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),

    Lapis_Lazuli_Copper("blue_copper",11,new int[] {2,4,3,2},15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,1f,0f,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    Wooden("wooden",10,new int[] {2,4,3,1},8,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0,0f,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    Stone("stone",11,new int[] {2,4,3,1},14,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0,0.1f,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    Amethyst("amethyst",20,new int[] {3,7,6,3},30,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,3f,0.1f,
            () -> Ingredient.ofItems(ModItems.amethyst_ingot)),



    ;
    





    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11,16,15,13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MyVillageMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

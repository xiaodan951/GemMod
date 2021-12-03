package net.xiaodan951.gemmod.weapons;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.xiaodan951.gemmod.item.ItemRegistry;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
{

    OBSIDIAN(3, 3000, 10.0F, 3.0F, 30, () ->{
        return Ingredient.fromItems(ItemRegistry.Obsidian_Ingot.get());
    }),
    WHITEJADE(4, 3500, 14.0F, 4.0F, 35, () -> {
        return Ingredient.fromItems(ItemRegistry.Whitejade.get());
    }),
    TOPAZ(4,3250, 12.0F, 3.5F, 32, () -> {
        return Ingredient.fromItems(ItemRegistry.Topaz.get());
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

}


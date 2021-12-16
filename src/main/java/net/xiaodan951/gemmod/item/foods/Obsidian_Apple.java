package net.xiaodan951.gemmod.item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.xiaodan951.gemmod.group.ModGroup;

public class Obsidian_Apple extends Item
{
    public static final Food FOOD = (new Food.Builder())
            .hunger(5)
            .saturation(5)
            .effect(() -> new EffectInstance(Effects.HUNGER, 5 * 20, 9), 0.3f)
            .effect(() ->new EffectInstance(Effects.RESISTANCE, 60*20,3), 1)
            .setAlwaysEdible()
            .build();

    public Obsidian_Apple() {
        super(new Properties().food(FOOD).group(ModGroup.GemmodFood));
    }
}
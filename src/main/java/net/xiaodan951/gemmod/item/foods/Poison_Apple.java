package net.xiaodan951.gemmod.item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.xiaodan951.gemmod.group.ModGroup;

public class Poison_Apple extends Item
{
    public static final Food FOOD = (new Food.Builder())
            .hunger(2)
            .saturation(2)
            .effect(() -> new EffectInstance(Effects.HUNGER, 60 * 20, 4), 1F)
            .effect(() ->new EffectInstance(Effects.POISON, 60*20,4), 1F)
            .build();

    public Poison_Apple() {
        super(new Properties().food(FOOD).group(ModGroup.GemmodFood));
    }
}

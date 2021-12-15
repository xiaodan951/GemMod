package net.xiaodan951.gemmod.items.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.xiaodan951.gemmod.group.ModGroup;

public class Topaz_Apple extends Item
{
    public static final Food FOOD = (new Food.Builder())
            .saturation(4)
            .hunger(4)
            .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 60*20, 4), 1F)
            .setAlwaysEdible()
            .build();

    public Topaz_Apple() {
        super(new Properties().food(FOOD).group(ModGroup.GemmodFood));
    }
}

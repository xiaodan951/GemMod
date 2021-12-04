package net.xiaodan951.gemmod.items.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.xiaodan951.gemmod.group.ModGroup;

public class Whitejade_Apple extends Item
{
    public static final Food FOOD = (new Food.Builder())
            .saturation(10)
            .hunger(10)
            .effect(() -> new EffectInstance(Effects.REGENERATION, 5 * 20, 4), 1)
            .setAlwaysEdible()
            .build();

    public Whitejade_Apple() {
        super(new Properties().food(FOOD).group(ModGroup.GemmodGroup));
    }
}

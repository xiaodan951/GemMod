package net.xiaodan951.gemmod.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.xiaodan951.gemmod.group.ModGroup;

public class Whitejade_Apple extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(10)
            .hunger(10)
            .effect(() -> new EffectInstance(Effects.REGENERATION, 3 * 20, 3), 1)
            .build();



    public Whitejade_Apple() {
        super(new Properties().food(FOOD).group(ItemGroup.FOOD));
    }
}

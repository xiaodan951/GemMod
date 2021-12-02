package net.xiaodan951.gemmod.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.xiaodan951.gemmod.group.ModGroup;

public class ObsidianApple extends Item {
    public static final Food FOOD = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(() -> new EffectInstance(Effects.HUNGER, 20, 1), 1)
            .build();

    public ObsidianApple() {
        super(new Properties().food(FOOD).group(ModGroup.GemmodGroup));
    }
}
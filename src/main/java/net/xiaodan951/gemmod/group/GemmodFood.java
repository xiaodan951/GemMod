package net.xiaodan951.gemmod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xiaodan951.gemmod.items.food.ItemRegistry;

public class GemmodFood extends ItemGroup
{

    public GemmodFood() {
        super("gemmod_food");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.Whitejade_Apple.get());
    }
}

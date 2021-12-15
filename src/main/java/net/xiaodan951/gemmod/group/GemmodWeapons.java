package net.xiaodan951.gemmod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xiaodan951.gemmod.items.weapons.ItemRegistry;

public class GemmodWeapons extends ItemGroup
{
    public GemmodWeapons() {
        super("gemmod_weapons");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.Whitejade_Sword.get());
    }
}

package net.xiaodan951.gemmod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xiaodan951.gemmod.item.ItemRegistry;

public class GemmodGroup extends ItemGroup {
    public GemmodGroup() {
        super("gemmod_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.Whitejade.get());
    }
}

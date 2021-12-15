package net.xiaodan951.gemmod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xiaodan951.gemmod.items.ItemRegistry;

public class GemmodItem extends ItemGroup {
    public GemmodItem() {
        super("gemmod_item");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.Whitejade.get());
    }
}

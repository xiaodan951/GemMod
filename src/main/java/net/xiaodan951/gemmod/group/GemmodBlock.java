package net.xiaodan951.gemmod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xiaodan951.gemmod.block.ItemRegistry;

public class GemmodBlock extends ItemGroup
{
    public GemmodBlock() {
        super("gemmod_block");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.Topaz_Block.get());
    }
}

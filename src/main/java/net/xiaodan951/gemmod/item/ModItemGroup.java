package net.xiaodan951.gemmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup
{

    public static final ItemGroup GEM_MOD = new ItemGroup("gemModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.WHITE_JADE.get());
        }
    };

}

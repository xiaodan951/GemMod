package net.xiaodan951.gemmod.item.tools;

import net.minecraft.item.HoeItem;
import net.xiaodan951.gemmod.group.ModGroup;
import net.xiaodan951.gemmod.item.weapons.GemmodItemTier;

public class Obsidian_Hoe extends HoeItem {
    public Obsidian_Hoe() {
        super(GemmodItemTier.OBSIDIAN, 2, -2.4F, (new Properties().group(ModGroup.GemmodTool)));
    }
}

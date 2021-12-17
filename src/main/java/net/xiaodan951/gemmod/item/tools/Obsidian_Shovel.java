package net.xiaodan951.gemmod.item.tools;

import net.minecraft.item.ShovelItem;
import net.xiaodan951.gemmod.group.ModGroup;
import net.xiaodan951.gemmod.item.weapons.GemmodItemTier;

public class Obsidian_Shovel extends ShovelItem {
    public Obsidian_Shovel() {
        super(GemmodItemTier.OBSIDIAN, 5, -2.1F, (new Properties().group(ModGroup.GemmodTool)));
    }
}

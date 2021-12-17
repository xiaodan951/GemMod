package net.xiaodan951.gemmod.item.tools;

import net.minecraft.item.AxeItem;
import net.xiaodan951.gemmod.group.ModGroup;
import net.xiaodan951.gemmod.item.weapons.GemmodItemTier;

public class Obsidian_Axe extends AxeItem {
    public Obsidian_Axe() {
        super(GemmodItemTier.OBSIDIAN, 7, -1.9F, (new Properties().group(ModGroup.GemmodTool)));
    }
}

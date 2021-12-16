package net.xiaodan951.gemmod.item.tools;

import net.minecraft.item.AxeItem;
import net.xiaodan951.gemmod.group.ModGroup;
import net.xiaodan951.gemmod.item.weapons.ModItemTier;

public class Obsidian_Axe extends AxeItem {
    public Obsidian_Axe() {
        super(ModItemTier.OBSIDIAN, 7, -1.9F, (new Properties().group(ModGroup.GemmodTool)));
    }
}

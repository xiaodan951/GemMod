package net.xiaodan951.gemmod.items.weapons;

import net.minecraft.item.SwordItem;
import net.xiaodan951.gemmod.group.ModGroup;

public class Topaz_Sword extends SwordItem {
    public Topaz_Sword () {
        super(ModItemTier.TOPAZ, 4, -3,new Properties().group(ModGroup.GemmodWeapons));
    }
}

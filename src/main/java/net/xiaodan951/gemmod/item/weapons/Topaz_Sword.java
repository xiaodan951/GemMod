package net.xiaodan951.gemmod.item.weapons;

import net.minecraft.item.SwordItem;
import net.xiaodan951.gemmod.group.ModGroup;

public class Topaz_Sword extends SwordItem {
    public Topaz_Sword () {
        super(GemmodItemTier.TOPAZ, 4, -3,new Properties().group(ModGroup.GemmodWeapons));
    }
}

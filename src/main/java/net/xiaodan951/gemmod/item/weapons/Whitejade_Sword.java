package net.xiaodan951.gemmod.item.weapons;

import net.minecraft.item.SwordItem;
import net.xiaodan951.gemmod.group.ModGroup;

public class Whitejade_Sword extends SwordItem {
    public Whitejade_Sword () {
        super(GemmodItemTier.WHITEJADE, 5, -2,new Properties().group(ModGroup.GemmodWeapons));
    }
}

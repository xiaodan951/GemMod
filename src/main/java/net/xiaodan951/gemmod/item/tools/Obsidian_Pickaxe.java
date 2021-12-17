package net.xiaodan951.gemmod.item.tools;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.xiaodan951.gemmod.group.ModGroup;
import net.xiaodan951.gemmod.item.weapons.GemmodItemTier;

public class Obsidian_Pickaxe extends PickaxeItem {
    public Obsidian_Pickaxe() {
        super(GemmodItemTier.OBSIDIAN, 3, -2.0F, (new Item.Properties().group(ModGroup.GemmodTool)));
    }
}

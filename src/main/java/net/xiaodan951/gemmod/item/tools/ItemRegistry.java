package net.xiaodan951.gemmod.item.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> Obsidian_pickaxe = ITEMS.register("obsidian_pickaxe", Obsidian_Pickaxe::new);
    public static final RegistryObject<Item> Obsidian_axe = ITEMS.register("obsidian_axe", Obsidian_Axe::new);
}

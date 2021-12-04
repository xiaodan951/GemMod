package net.xiaodan951.gemmod.items.weapons;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> Obsidian_Sword = ITEMS.register("obsidian_sword", Obsidian_Sword::new);
    public static final RegistryObject<Item> Whitejade_Sword = ITEMS.register("whitejade_sword", Whitejade_Sword::new);
}

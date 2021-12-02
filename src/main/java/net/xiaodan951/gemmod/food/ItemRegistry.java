package net.xiaodan951.gemmod.food;


import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;


public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> Obsidian_Apple = ITEMS.register("obsidian_apple", Obsidian_Apple::new);
    public static final RegistryObject<Item> Whitejade_Apple = ITEMS.register("whitejade_apple", Whitejade_Apple::new);
}

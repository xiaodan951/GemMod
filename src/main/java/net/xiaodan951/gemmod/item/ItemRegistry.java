package net.xiaodan951.gemmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> Whitejade = ITEMS.register("whitejade", Whitejade::new);
    public static final RegistryObject<Item> Obsidian_Ingot = ITEMS.register("obsidian_ingot", Obsidian_Ingot::new);
    public static final RegistryObject<Item> Topaz = ITEMS.register("topaz", Topaz::new);

}

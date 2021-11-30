package net.xiaodan951.gemmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.GemMod;

public class ModItems
{

    public static final DeferredRegister <Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemMod.MOD_ID);

    public static final RegistryObject<Item> WHITE_JADE = ITEMS.register("white_jade", () -> new Item(new Item.Properties().group(ModItemGroup.GEM_MOD)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().group(ModItemGroup.GEM_MOD)));


    public static void register(IEventBus eventBus)
    {

        ITEMS.register(eventBus);

    }



}

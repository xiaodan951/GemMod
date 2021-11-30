package net.xiaodan951.jewemod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.jewemod.JeweMod;

public class ModItems
{

    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JeweMod.MOD_ID);

    public static final RegistryObject<Item> WHITE_JADE = ITEMS.register("white_jade", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


    public static void register(IEventBus eventBus)
    {

        ITEMS.register(eventBus);

    }



}

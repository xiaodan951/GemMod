package net.xiaodan951.gemmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xiaodan951.gemmod.item.ItemRegistry;

@Mod(Utils.MOD_ID)
public class Gemmod {
    public Gemmod ()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(eventBus);

        net.xiaodan951.gemmod.food.ItemRegistry.ITEMS.register(eventBus);
        net.xiaodan951.gemmod.weapons.ItemRegistry.ITEMS.register(eventBus);
    }


}

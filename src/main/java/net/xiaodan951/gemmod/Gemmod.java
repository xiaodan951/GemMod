package net.xiaodan951.gemmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xiaodan951.gemmod.item.ItemRegistry;

@Mod(Utils.MOD_ID)
public class Gemmod {
    public Gemmod ()
    {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}

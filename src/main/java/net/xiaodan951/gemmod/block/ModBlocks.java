package net.xiaodan951.gemmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.GemMod;
import net.xiaodan951.gemmod.item.ModItemGroup;
import net.xiaodan951.gemmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks
{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemMod.MOD_ID);


    private static <T extends Block>RegistryObject<T> registerBlock(String name , Supplier<T> block)
    {
        RegistryObject<T> toReturn= BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {

        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().group(ModItemGroup.GEM_MOD)));

    }


    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}

package net.xiaodan951.gemmod.block;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;
import net.xiaodan951.gemmod.group.ModGroup;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> Obsidian_Block = ITEMS.register("obsidian_block", () -> new BlockItem(BlockRegistry.Obsidian_Block.get(), new Item.Properties().group(ModGroup.GemmodBlock)));
    public static final RegistryObject<Item> Topaz_Block = ITEMS.register("topaz_block", ()-> new BlockItem(BlockRegistry.Topaz_Block.get(), new Item.Properties().group(ModGroup.GemmodBlock)));

}

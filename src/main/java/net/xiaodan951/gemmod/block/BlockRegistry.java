package net.xiaodan951.gemmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiaodan951.gemmod.Utils;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

    public static final RegistryObject<Block> Obsidian_Block = BLOCKS.register("obsidian_block", Obsidian_Block::new);
    public static final RegistryObject<Block> Topaz_Block = BLOCKS.register("topaz_block", Topaz_Block::new);
    public static final RegistryObject<Block> Whitejade_Block = BLOCKS.register("whitejade_block", Whitejade_Block::new);
}

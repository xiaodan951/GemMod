package net.xiaodan951.gemmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Topaz_Block extends Block
{
    public Topaz_Block()
    {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .hardnessAndResistance(5f,6f));
    }
}

package net.xiaodan951.gemmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Obsidian_Block extends Block {
    public Obsidian_Block() {
        super(Properties.create(Material.ROCK).hardnessAndResistance
                (5f, 6f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}

package com.hurr1cane.letsmodreboot.init;

import com.hurr1cane.letsmodreboot.block.BlockFlag;
import com.hurr1cane.letsmodreboot.block.BlockLMRB;
import com.hurr1cane.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }

}

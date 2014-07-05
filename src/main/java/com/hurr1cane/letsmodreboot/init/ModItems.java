package com.hurr1cane.letsmodreboot.init;

import com.hurr1cane.letsmodreboot.item.ItemLMRB;
import com.hurr1cane.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}

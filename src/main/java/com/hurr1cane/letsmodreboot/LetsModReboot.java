package com.hurr1cane.letsmodreboot;

import com.hurr1cane.letsmodreboot.configuration.ConfigurationHandler;
import com.hurr1cane.letsmodreboot.proxy.IProxy;
import com.hurr1cane.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID,name= Reference.MOD_NAME,version= Reference.VERSION)
public class LetsModReboot
{

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY,serverSide =Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        ConfigurationHandler.init()
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }






}

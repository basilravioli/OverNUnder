package com.OvernUnder.BasilRavioli;


import com.OvernUnder.BasilRavioli.proxy.CommonProxy;
import com.OvernUnder.BasilRavioli.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class OverNUnderInc
{
    @Mod.Instance
    public static OverNUnderInc instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
    @Mod.EventHandler
    public void ServerInit(FMLServerStartingEvent event) {}
}

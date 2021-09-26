package com.OvernUnder.BasilRavioli.objects.items;

import com.OvernUnder.BasilRavioli.OverNUnderInc;
import com.OvernUnder.BasilRavioli.init.ItemInit;
import com.OvernUnder.BasilRavioli.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        OverNUnderInc.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
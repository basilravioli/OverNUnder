package com.OvernUnder.BasilRavioli.proxy;

import com.OvernUnder.BasilRavioli.objects.items.ItemBase;
import net.minecraft.item.Item;

public abstract class CommonProxy
{
    public void registerItemRenderer(ItemBase item, int meta, String id) {}

    public abstract void registerItemRenderer(Item item, int meta, String id);
}

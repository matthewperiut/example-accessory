package com.matthewperiut.exaccessory;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.item.tool.TemplatePickaxe;
import net.modificationstation.stationapi.api.util.Null;
import org.apache.logging.log4j.Logger;

public class ItemListener
{
    @Entrypoint.ModID
    public static final ModID MODID = Null.get();
    @EventListener
    private static void registerItems(ItemRegistryEvent event)
    {
        EXPLOSION_RING = new ExplosionRing(Identifier.of(MODID, "exaccessory")).setTranslationKey(MODID, "explosion_ring");
    }
    public static ItemBase EXPLOSION_RING;
}

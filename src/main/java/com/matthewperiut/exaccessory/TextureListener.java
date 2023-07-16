package com.matthewperiut.exaccessory;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class TextureListener
{
    @Entrypoint.ModID
    public static final ModID MODID = Null.get();
    @EventListener
    public void registerTextures(TextureRegisterEvent event)
    {
        ItemListener.EXPLOSION_RING.setTexture(Identifier.of(MODID, "item/explosion_ring"));
    }
}

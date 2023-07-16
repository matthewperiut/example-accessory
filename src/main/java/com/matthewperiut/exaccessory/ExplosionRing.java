package com.matthewperiut.exaccessory;

import com.matthewperiut.accessoryapi.api.Accessory;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.entity.PlayerRenderer;
import net.minecraft.client.render.entity.model.Biped;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.modificationstation.stationapi.impl.block.NetherPortalImpl;

public class ExplosionRing extends TemplateItemBase implements Accessory
{
    public ExplosionRing(Identifier identifier)
    {
        super(identifier);
    }

    @Override
    public Type getType()
    {
        return Type.ring;
    }

    @Override
    public void tickWhileWorn(PlayerBase player, ItemInstance item)
    {
        if (player.method_1373() && player.field_511 % 100 == 0) // isSneaking && ticksAlive % 20 == 0
            player.level.createExplosion(player, player.x, player.y+2, player.z, 2.f);
    }

    @Override
    public void renderWhileWorn(PlayerBase player, PlayerRenderer playerRenderer, ItemInstance itemInstance, Biped biped, Object[] objects)
    {

    }

    @Override
    public void onAccessoryAdded(PlayerBase playerBase, ItemInstance itemInstance)
    {

    }

    @Override
    public void onAccessoryRemoved(PlayerBase playerBase, ItemInstance itemInstance)
    {

    }
}

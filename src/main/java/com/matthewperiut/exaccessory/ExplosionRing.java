package com.matthewperiut.exaccessory;

import com.matthewperiut.accessoryapi.api.Accessory;
import net.minecraft.client.render.entity.PlayerRenderer;
import net.minecraft.client.render.entity.model.Biped;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class ExplosionRing extends TemplateItemBase implements Accessory
{
    public ExplosionRing(Identifier identifier)
    {
        super(identifier);
        setMaxStackSize(1);
        setDurability(100);
    }

    @Override
    public Type getType()
    {
        return Type.ring;
    }

    @Override
    public void tickWhileWorn(PlayerBase player, ItemInstance item)
    {
        if (rand.nextInt(20) == 0)
            if (player.method_1373())
            {
                player.level.createExplosion(player, player.x, player.y+2, player.z, 2.f);
                item.applyDamage(1, player);
            }
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

package org.toast.refiningbind;

import Ly.bind.api.LyBindAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.toast.refine.api.WeaponModification;
import org.toast.refine.handler.RefineHandler;

public class WeaponBind extends WeaponModification {


    @Override
    public ItemStack modifyItem(RefineHandler refineHandler, ItemStack item) {
        Player player = refineHandler.getPLAYER();
        return LyBindAPI.bind(player,item, LyBindAPI.BindType.EQUIP);
    }
}

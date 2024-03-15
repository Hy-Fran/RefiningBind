package org.toast.refiningbind;

import org.bukkit.plugin.java.JavaPlugin;
import org.toast.refine.api.RefineAPI;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        RefineAPI api = RefineAPI.getAPI();
        if (api != null) {
            getLogger().info("检测到ToastRefine启动成功");
            WeaponBind bind = new WeaponBind();
            bind.register();
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

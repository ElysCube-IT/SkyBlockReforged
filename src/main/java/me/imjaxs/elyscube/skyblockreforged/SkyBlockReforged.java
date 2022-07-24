package me.imjaxs.elyscube.skyblockreforged;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlockReforged extends JavaPlugin {
    @Getter private static SkyBlockReforged instance;

    @Override
    public void onEnable() {
        // MAIN INSTANCE
        instance = this;
    }

    @Override
    public void onDisable() {

    }
}

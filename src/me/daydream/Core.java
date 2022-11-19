package me.daydream;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    private static Core plugin;




    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage(Util.colorize("&aGlass Rebuilder Enabled"));
        this.getServer().getPluginManager().registerEvents(new GlassBreakListener(), this);
        this.getServer().getPluginManager().registerEvents(new HealSoup(), this);
        this.getServer().getPluginManager().registerEvents(new NoOffHand(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(Util.colorize("&cGlass Rebuilder Disabled"));
    }
    public static Core getPlugin() {
        return plugin;
    }
}

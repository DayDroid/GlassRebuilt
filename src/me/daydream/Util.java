package me.daydream;

import org.bukkit.ChatColor;

public class Util {
    public static String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}

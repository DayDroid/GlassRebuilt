package me.daydream;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class NoOffHand implements Listener {
    @EventHandler
    private void stopHandSwap(PlayerSwapHandItemsEvent psie) {
            psie.setCancelled(true);
            psie.getPlayer().sendMessage("§cYou cannot place items in your offhand!");
        }

    @EventHandler
    private void stopPuttingInOffHand(InventoryClickEvent ice) {
            if (ice.getRawSlot() == 45) {
                ice.setCancelled(true);
                ice.getWhoClicked().sendMessage("§cYou cannot place items in your offhand!");
            }
    }
    @EventHandler
    private void stopInventoryDragging(InventoryDragEvent ide) {
        if (ide.getInventorySlots().equals(45)) {
            ide.setCancelled(true);
            ide.getWhoClicked().sendMessage("§cYou cannot place items in your offhand!");
        }

    }
}


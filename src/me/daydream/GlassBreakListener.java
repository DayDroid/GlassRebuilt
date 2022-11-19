package me.daydream;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.scheduler.BukkitRunnable;

import static org.bukkit.Material.*;

public class GlassBreakListener implements Listener {

    @EventHandler
    private void GlassBreakEvent(BlockBreakEvent bbe) {
        Player p = bbe.getPlayer();
        Block b = bbe.getBlock();
        Material m = b.getType();
        World w = p.getWorld();

        switch (m) {
            case GLASS:
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        w.getBlockAt(bbe.getBlock().getLocation()).setType(GLASS);
                        w.playSound(bbe.getBlock().getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
                        w.playSound(bbe.getBlock().getLocation(), Sound.BLOCK_GLASS_FALL, 1.0F, 1.0F);
                    }
                }.runTaskLater(Core.getPlugin(), 60L);
                break;

            case STAINED_GLASS_PANE:
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        w.getBlockAt(bbe.getBlock().getLocation()).setType(STAINED_GLASS_PANE);
                        w.playSound(bbe.getBlock().getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
                        w.playSound(bbe.getBlock().getLocation(), Sound.BLOCK_GLASS_FALL, 1.0F, 1.0F);
                    }
                }.runTaskLater(Core.getPlugin(), 60L);

            case THIN_GLASS:
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        w.getBlockAt(bbe.getBlock().getLocation()).setType(THIN_GLASS);
                        w.playSound(bbe.getBlock().getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
                        w.playSound(bbe.getBlock().getLocation(), Sound.BLOCK_GLASS_FALL, 1.0F, 1.0F);
                    }
                }.runTaskLater(Core.getPlugin(), 60L);
        }
    }





    @EventHandler
    private void EntityBreakGlass(BlockDamageEvent ecbe) {
        Block b = ecbe.getBlock();
        Material m = b.getType();
        World w = ecbe.getBlock().getWorld();
        switch (m) {
            case GLASS:
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        w.getBlockAt(ecbe.getBlock().getLocation()).setType(GLASS);
                        w.playSound(ecbe.getBlock().getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
                        w.playSound(ecbe.getBlock().getLocation(), Sound.BLOCK_GLASS_FALL, 1.0F, 1.0F);
                    }
                }.runTaskLater(Core.getPlugin(), 60L);
                break;

            case STAINED_GLASS_PANE:
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        w.getBlockAt(ecbe.getBlock().getLocation()).setType(STAINED_GLASS_PANE);
                        w.playSound(ecbe.getBlock().getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
                        w.playSound(ecbe.getBlock().getLocation(), Sound.BLOCK_GLASS_FALL, 1.0F, 1.0F);
                    }
                }.runTaskLater(Core.getPlugin(), 60L);

            case THIN_GLASS:
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        w.getBlockAt(ecbe.getBlock().getLocation()).setType(THIN_GLASS);
                        w.playSound(ecbe.getBlock().getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
                        w.playSound(ecbe.getBlock().getLocation(), Sound.BLOCK_GLASS_FALL, 1.0F, 1.0F);
                    }
                }.runTaskLater(Core.getPlugin(), 60L);
        }
    }
}
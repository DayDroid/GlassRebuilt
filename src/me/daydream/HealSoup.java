package me.daydream;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class HealSoup implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent pie) {
        Action a = pie.getAction();
        Player p = pie.getPlayer();


        if (!(p.getHealth() <= 20.0F)) return;
        if (p.getHealth() > 20.0F) return;
        if ( a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
            if(p.getInventory().getItemInMainHand().isSimilar(new ItemStack(Material.MUSHROOM_SOUP))) {
                subtractOne(p);
                p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 0.5F, 2);
                p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 0.5F, 1.0F);
                p.setHealth(p.getHealth() + 3.0F);
                p.spawnParticle(Particle.HEART, p.getLocation(), 3, 0, 2.5, 0, 3);
            }
            if(p.getInventory().getItemInMainHand().isSimilar(new ItemStack(Material.BEETROOT_SOUP))) {
                subtractOne(p);
                p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 0.5F, 2);
                p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 0.5F, 1.0F);
                p.setHealth(p.getHealth() + 3.0F);
                p.spawnParticle(Particle.HEART, p.getLocation(), 3, 0, 2.5, 0, 3);
            }
            if(p.getInventory().getItemInMainHand().isSimilar(new ItemStack(Material.RABBIT_STEW))) {
                subtractOne(p);
                p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 0.5F, 2);
                p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 0.5F, 1.0F);
                p.setHealth(p.getHealth() + 3.0F);
                p.spawnParticle(Particle.HEART, p.getLocation(), 3, 0, 2.5, 0, 3);
            }
        }
    }

    /**
     *
     * @param p p is the player, usually will be just 'p'
     *
     **/
    private void subtractOne(Player p) {
        p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
    }



    @EventHandler
    private void stopSoupDrinking(PlayerItemConsumeEvent pice) {
        Player p = pice.getPlayer();
        if (p.getInventory().getItemInMainHand().equals(Material.MUSHROOM_SOUP) || p.getInventory().getItemInMainHand().equals(Material.BEETROOT_SOUP) || p.getInventory().getItemInMainHand().equals(Material.RABBIT_STEW)) {
            pice.setCancelled(true);
        }
    }
}

//            if (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
//                if (p.getInventory().getItemInMainHand().equals(Material.MUSHROOM_SOUP)) {
//                    p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
//                    p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 0.5F, 2.0F);
//                    p.setHealth(p.getHealth() + 0.5F);
//                    p.spawnParticle(Particle.HEART, p.getLocation(), 1);
//                }
//            }
//        }
//
//    }

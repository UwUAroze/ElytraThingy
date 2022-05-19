package me.aroze.elytrathingy;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class AntiBlockBreak implements Listener {

    @EventHandler
    public void EntityChangeBlockEvent (final EntityChangeBlockEvent e) {
        Bukkit.broadcastMessage("a");
        if (e.getEntityType() == EntityType.FALLING_BLOCK) {
            Bukkit.broadcastMessage("b");
            e.setCancelled(true);
            e.getBlock().setType(Material.WHITE_CONCRETE);
        }
    }

}

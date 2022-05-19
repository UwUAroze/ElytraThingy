package me.aroze.elytrathingy;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

public class GenerateLoop{
    public static void start() {

        BukkitTask task = Bukkit.getScheduler().runTaskTimer(ElytraThingy.getInstance(), () -> {
            Bukkit.broadcastMessage("a");
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (p.isGliding()) {

                    Location playerLoc = p.getLocation();
                    int addX = (int) (10 + (Math.random() * 30));
                    int addZ = (int) (10 + (Math.random() * 30));
                    Location hooploc = playerLoc.add(addX, 0, addZ);

                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.add(0, 1, 0)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.add(0, -1, 0)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.add(0, 0, 1)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.add(0, 0, -1)).setType(Material.PINK_WOOL);

                }
            }
        } , 0, 200);
    }
}


package me.aroze.elytrathingy;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

public class GenerateLoop{
    public static void start() {

        BukkitTask task = Bukkit.getScheduler().runTaskTimer(ElytraThingy.getInstance(), () -> {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (p.isGliding()) {

                    p.sendMessage("§aElytraThingy §7» §aGenerated Hole.");

                    Location playerLoc = p.getLocation();
                    int addX = (int) (10 + (Math.random() * 30));
                    int addZ = (int) (10 + (Math.random() * 30));
                    Location hooploc = playerLoc.add(addX, 0, addZ);

                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc).setType(Material.STONE);

                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, 1, 0)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, 1, 1)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, -2, 0)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, -2, 1)).setType(Material.PINK_WOOL);

                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, 0, -1)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, 0, 2)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, -1, -1)).setType(Material.PINK_WOOL);
                    Bukkit.getWorld(p.getWorld().getName()).getBlockAt(hooploc.getBlock().getLocation().add(0, -1, 2)).setType(Material.PINK_WOOL);

                }
            }
        } , 0, 60);
    }
}


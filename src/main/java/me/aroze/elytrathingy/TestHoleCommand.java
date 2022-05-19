package me.aroze.elytrathingy;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestHoleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Location middle = ((Player) sender).getLocation();

        middle.clone().add(1,0,0).getBlock().setType(Material.STONE);

        Location bottomLeft = middle.clone().add(0, -2, -2);


        //Bottom row block catchers
        for (int i=1; i <= 3; i++) {
            bottomLeft.clone().add(0, -1, i).getBlock().setType(Material.BARRIER);
        }
        //Column block catchers
        bottomLeft.getBlock().setType(Material.BARRIER);
        bottomLeft.clone().add(0, 0, 4).getBlock().setType(Material.BARRIER);

        //Bottom row blocks
        for (int i=1; i <= 3; i++) {
            Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,10,i), Material.WHITE_CONCRETE, (byte) 0);
        }
        
        //Left column blocks
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,10,-2), Material.WHITE_CONCRETE, (byte) 0);
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,12,-2), Material.WHITE_CONCRETE, (byte) 0);
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,14,-2), Material.WHITE_CONCRETE, (byte) 0);

        //Right column blocks
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,10,2), Material.WHITE_CONCRETE, (byte) 0);
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,12,2), Material.WHITE_CONCRETE, (byte) 0);
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,14,2), Material.WHITE_CONCRETE, (byte) 0);


        return true;
    }
}

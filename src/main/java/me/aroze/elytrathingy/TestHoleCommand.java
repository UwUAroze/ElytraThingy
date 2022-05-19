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

        Location bottomLeft = middle.clone().add(-2, -2, 0);


        bottomLeft.clone().add(0, -1, 1).getBlock().setType(Material.BARRIER);
        bottomLeft.clone().add(0, -1, 2).getBlock().setType(Material.BARRIER);

        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,0,1), Material.WHITE_CONCRETE, (byte) 0);
        Bukkit.getWorld(((Player) sender).getWorld().getName()).spawnFallingBlock(bottomLeft.clone().add(0,0,2), Material.WHITE_CONCRETE, (byte) 0);


        return true;
    }
}

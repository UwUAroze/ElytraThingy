package me.aroze.elytrathingy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class ElytraThingy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("testHole").setExecutor(new TestHoleCommand());

        GenerateLoop.start();

    }


        @Override
        public void onDisable() {
            // Plugin shutdown logic
        }

        public static ElytraThingy getInstance () {
            return getPlugin(ElytraThingy.class);
        }
}

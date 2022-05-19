package me.aroze.elytrathingy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class ElytraThingy extends JavaPlugin {
    private int taskID = -1;

    @Override
    public void onEnable() {
        // Plugin startup logic
        BukkitTask task = Bukkit.getScheduler().runTaskTimer(this, new GenerateLoop(), 0L, 200L);
        taskID = task.getTaskId();

    }


        @Override
        public void onDisable() {
            // Plugin shutdown logic
            Bukkit.getScheduler().cancelTask(taskID);
        }

        public static ElytraThingy getInstance () {
            return getPlugin(ElytraThingy.class);
        }
}

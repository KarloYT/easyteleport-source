package com.easyteleport.easyteleport;

import com.easyteleport.easyteleport.commands.TeleportAllCommand;
import com.easyteleport.easyteleport.commands.teleportCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyTeleport extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("tp").setExecutor(new teleportCommand());
        getCommand("tpall").setExecutor(new TeleportAllCommand());

        System.out.println("[EasyTeleport] ===============================================");
        System.out.println("[EasyTeleport] Loading config.yml");
        System.out.println("[EasyTeleport] Connecting to the java API");
        System.out.println("[EasyTeleport] Loading versions...");
        System.out.println("[EasyTeleport] Hooking into essentially");
        System.out.println("[EasyTeleport] Loaded Started the plugin successfully");
        System.out.println("[EasyTeleport] Continuing with server start");
        System.out.println("[EasyTeleport] ======THANKS FOR USING EASYTELEPORT======");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("[EasyTeleport] ===============================================");
        System.out.println("[EasyTeleport] Saving config.yml");
        System.out.println("[EasyTeleport] Disconnecting from the java API");
        System.out.println("[EasyTeleport] Unhooking essentials");
        System.out.println("[EasyTeleport] Disabling the plugin...");
        System.out.println("[EasyTeleport] Continuing with the server shutdown.");
    }
}

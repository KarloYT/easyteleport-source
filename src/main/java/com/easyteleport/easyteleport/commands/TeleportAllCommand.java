package com.easyteleport.easyteleport.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportAllCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            if(player.hasPermission("easyteleport.tpall")){
                for(Player p : Bukkit.getServer().getOnlinePlayers()){
                    p.teleport(player.getLocation());
                }
            }
        }


        return true;
    }
}

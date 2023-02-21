package com.easyteleport.easyteleport.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class teleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;
            // tp <player> [player>
            if(player.hasPermission("easyteleport.tpbypass")){
                if(args.length == 0){
                    player.sendMessage(ChatColor.RED + "Please provide an player to teleport to.!");
                    player.sendMessage(ChatColor.YELLOW + "To teleport yourself to someone else do /tp <player>");
                    player.sendMessage(ChatColor.YELLOW + "To teleport a player to another one do /tp <player> <another player>");
                }else if(args.length == 1){
                    Player target = Bukkit.getPlayer(args[0]);

                    try{
                        player.teleport(target.getLocation());
                    }catch (NullPointerException e){
                        player.sendMessage(ChatColor.RED + "This player does not exist on this server. The player has to be online OR in vanish.");
                    }
                }else if(args.length == 2){
                    Player playerToSend = Bukkit.getPlayer(args[0]);
                    Player target = Bukkit.getPlayer(args[1]);

                    try{
                        playerToSend.teleport(target.getLocation());
                    }catch(NullPointerException e){
                        player.sendMessage(ChatColor.RED + "This player does not exist on this server. The player has to be online OR in vanish.");
                    }
                }
            }
        }

        return true;
    }
}

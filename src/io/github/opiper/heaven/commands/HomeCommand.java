package io.github.opiper.heaven.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import io.github.opiper.heaven.Main;

public class HomeCommand implements CommandExecutor {
	
    @SuppressWarnings("unused")
	private static Main plugin;
    private FileConfiguration cfg;

    @SuppressWarnings("static-access")
	public HomeCommand(Main plugin) {
        this.plugin = plugin;
        
        plugin.getCommand("home").setExecutor(this);
    }
    
    @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
    	Player p = (Player) sender;

        if (!(sender instanceof Player)) {
        	sender.sendMessage("Player only command");
        	return true;
        }
        
        int x = cfg.getInt(p.getWorld().getName() + "." + p.getName() + "." + "X", p.getWorld().getSpawnLocation().getBlockX());
        int y = cfg.getInt(p.getWorld().getName() + "." + p.getName() + "." + "Y", p.getWorld().getSpawnLocation().getBlockY());
        int z = cfg.getInt(p.getWorld().getName() + "." + p.getName() + "." + "Z", p.getWorld().getSpawnLocation().getBlockZ());
        
        p.teleport(new Location(p.getWorld(), x, y, z));
        p.sendMessage("&6Teleported to home");
        return true;
        
    }
}
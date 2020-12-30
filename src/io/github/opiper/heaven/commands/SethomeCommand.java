package io.github.opiper.heaven.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import io.github.opiper.heaven.Main;

public class SethomeCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private static Main plugin;
	private FileConfiguration cfg;
	
	@SuppressWarnings("static-access")
	public SethomeCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("sethome").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		File file = new File("plugins/Heaven", "config.yml");
		
		cfg.set(p.getWorld().getName() + "." + p.getName() + "." + "X", p.getLocation().getBlockX());
        cfg.set(p.getWorld().getName() + "." + p.getName() + "." + "Y", p.getLocation().getBlockY());
        cfg.set(p.getWorld().getName() + "." + p.getName() + "." + "Z", p.getLocation().getBlockZ());
        
        try {
        	
        	cfg.save(file);
		} catch (IOException e) {	
			
			e.printStackTrace();			
		}
        
        p.sendMessage("&6Set your home in this world to [" + p.getLocation().getBlockX() + "|" + p.getLocation().getBlockY() + "|" + p.getLocation().getBlockZ() + "]");
        return true;
	}
	
}
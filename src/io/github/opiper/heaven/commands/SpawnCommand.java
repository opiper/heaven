package io.github.opiper.heaven.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.opiper.heaven.Main;

public class SpawnCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public SpawnCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("spawn").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		Location spawn = Bukkit.getServer().getWorld("world").getSpawnLocation();
		
		p.teleport(spawn);
		
		return true;
	}
}

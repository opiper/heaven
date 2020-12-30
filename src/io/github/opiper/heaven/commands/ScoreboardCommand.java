package io.github.opiper.heaven.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import io.github.opiper.heaven.Main;

public class ScoreboardCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private static Main plugin;
		
	@SuppressWarnings("static-access")
	public ScoreboardCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("sb").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		String name = p.getDisplayName();
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		String command = "scoreboard players set stephfj Deaths 1";
		if (name == "MurderousOwl") {
			Bukkit.dispatchCommand(console, command);
		}
			
		
		return false;
	}

}

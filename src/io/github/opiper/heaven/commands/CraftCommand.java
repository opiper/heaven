package io.github.opiper.heaven.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.opiper.heaven.Main;

public class CraftCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private static Main plugin;
		
	@SuppressWarnings("static-access")
	public CraftCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("craft").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			Player p = (Player) sender;
			p.openWorkbench(null, true);
		} else {
			sender.sendMessage("Only players can execute");
			return true;
		}
		
		
		return true;
	}

}

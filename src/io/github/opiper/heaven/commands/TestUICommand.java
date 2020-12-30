package io.github.opiper.heaven.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.opiper.heaven.Main;
import io.github.opiper.heaven.ui.TestUI;

public class TestUICommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public TestUICommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("test").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can execute");
			return true;
		}
		
		Player p = (Player) sender;
		
		p.openInventory(TestUI.GUI(p));

		return false;
	}

}

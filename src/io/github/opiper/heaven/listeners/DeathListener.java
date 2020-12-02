package io.github.opiper.heaven.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import io.github.opiper.heaven.Main;
import io.github.opiper.heaven.utils.Utils;

public class DeathListener implements Listener {
	
	@SuppressWarnings("unused")
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public DeathListener (Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);	
		
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		
		if (e.getEntity().getKiller() instanceof Player) {
			
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			if(p != killer) {
				killer.sendMessage(Utils.chat("&8[&aa*&8] &7You have killed &6 " + p.getDisplayName()));
				p.sendMessage(Utils.chat("&8[&c*&8] &7You have been killed by &c" + killer.getDisplayName()));
				return;
			}
		}
	}
	
}

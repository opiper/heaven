package io.github.opiper.heaven.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import io.github.opiper.heaven.Main;
import io.github.opiper.heaven.utils.Utils;

public class JoinListener implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin (PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("firstJoin_message").replace("<player>", p.getName())));
		} else {
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player", p.getName())));
		}
	}
	
}

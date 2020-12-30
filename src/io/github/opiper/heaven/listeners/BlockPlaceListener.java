package io.github.opiper.heaven.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import io.github.opiper.heaven.Main;

public class BlockPlaceListener implements Listener {
	
	@SuppressWarnings("unused")
	private static Main plugin; 
	
	@SuppressWarnings("static-access")
	public BlockPlaceListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		
		Player p = e.getPlayer();
	}

}

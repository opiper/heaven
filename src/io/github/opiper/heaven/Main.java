package io.github.opiper.heaven;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.opiper.heaven.commands.CraftCommand;
import io.github.opiper.heaven.commands.TestUICommand;
import io.github.opiper.heaven.listeners.DeathListener;
import io.github.opiper.heaven.listeners.InventoryClickListener;
import io.github.opiper.heaven.listeners.JoinListener;
import io.github.opiper.heaven.ui.TestUI;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new JoinListener(this);
		new DeathListener(this);
		new TestUICommand(this);
		new InventoryClickListener(this);
		TestUI.initialize();
		new CraftCommand(this);
	
	}
}

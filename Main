package dev.souljahwitch.Listeners;

import org.bukkit.plugin.java.JavaPlugin;

import dev.souljahwitch.Listeners.join.JoinListener;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this);
	}
}

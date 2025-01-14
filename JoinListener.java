package dev.souljahwitch.Listeners.join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import dev.souljahwitch.Listeners.Main;
import dev.souljahwitch.Listeners.utils.Utils;

public class JoinListener implements Listener{
	
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstJoin_message").replace("<player>", p.getName())));
		} else {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", p.getName())));
		}
	}
}

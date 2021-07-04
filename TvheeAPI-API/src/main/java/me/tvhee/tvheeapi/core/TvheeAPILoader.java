package me.tvhee.tvheeapi.core;

import java.util.Collection;
import java.util.UUID;
import me.tvhee.tvheeapi.api.command.ConsoleCommandSender;
import me.tvhee.tvheeapi.api.config.Configuration;
import me.tvhee.tvheeapi.api.files.CustomFile;
import me.tvhee.tvheeapi.api.player.Player;
import me.tvhee.tvheeapi.api.plugin.PluginManager;
import me.tvhee.tvheeapi.api.scheduler.Scheduler;

public interface TvheeAPILoader extends UniversalPluginLoader
{
	Configuration getYamlConfiguration();

	Player getPlayer(String name);

	Player getPlayer(UUID uuid);

	PluginManager getPluginManager();

	ConsoleCommandSender getConsoleSender();

	Scheduler getScheduler();

	Collection<Player> getOnlinePlayers();

	void updatePluginFile(CustomFile newVersion);
}

package net.runelite.client.plugins.pablosawesomeplugin;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Pablo's Awesome Plugin"
)
public class PabloPlugin extends Plugin
{
	@Inject //injects an instance of this dependency into this file
	private Client client;

	@Inject //injects an instance of this dependency into this file
	private PabloConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe //subscribes to specific game events. listens to events and executes logic when event occurs
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
		}
	}

	@Provides //used to indicate a method that provides an instance of a particular dependency
    PabloConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PabloConfig.class);
	}
}

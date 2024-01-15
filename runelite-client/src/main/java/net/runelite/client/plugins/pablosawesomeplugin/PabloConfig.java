package net.runelite.client.plugins.pablosawesomeplugin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("pablosawesomeplugin")
public interface PabloConfig extends Config
{
	@ConfigItem(
		keyName = "pablosawesomeplugin",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}
}

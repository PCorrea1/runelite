package net.runelite.client.plugins.pablosawesomeplugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PabloPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PabloPlugin.class);
		RuneLite.main(args);
	}
}
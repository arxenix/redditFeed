package com.bobacadodl.redditFeed;

import org.bukkit.plugin.java.JavaPlugin;

public class RedditFeedConfig extends Config{
	public RedditFeedConfig(JavaPlugin instance){
		this.setFile(instance);
	}
	public String subReddit = "Minecraft";
	public String section = "hot";
	public boolean random = true;
	
	public int interval = 120;
}

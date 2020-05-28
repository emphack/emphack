package com.emphack.client;

import com.emphack.client.module.Module;
import com.emphack.client.module.ModuleManager;
import com.emphack.client.ui.UIRenderer;

public class Client {

	public static String clientName = "EMPHACK";
	public static String clientVersion = "Alpha-1";
	public static String discordLogoHover = clientName + ": " + clientVersion;
	private DiscordRP discordRP = new DiscordRP();
	public static UIRenderer uiRenderer;
	public static ModuleManager moduleManager;
	private static final Client INSTANCE = new Client();
	public static final Client getInstance() { 
		return INSTANCE; 
	}
	
	public void init() {
		discordRP.start();
		moduleManager = new ModuleManager();
		moduleManager.init();
	}
	
	public static void renderUI() {
		uiRenderer = new UIRenderer();
	}
	
	public static void onGui() {
		uiRenderer.Draw();
	}
	
	public void shutdown() {
		discordRP.shutdown();
	}
	
	public DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	public static void onRender() {
		for(Module module : moduleManager.getEnabledModules()) {
			module.onRender();
		}
	}
	
	public static void onPreUpdate() {
		for(Module module : moduleManager.getEnabledModules()) {
			module.onPreUpdate();
		}
	}
	
	public static void onPostUpdate() {
		for(Module module : moduleManager.getEnabledModules()) {
			module.onPostUpdate();
		}
	}
	
	public static void onKeyPressed(int keyCode) {
		for(Module module : moduleManager.moduleList) {
			module.onKeyPressed(keyCode);
		}
	}
	
}

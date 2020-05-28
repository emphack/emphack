package com.emphack.client.ui;

import com.emphack.client.Client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;

public class UIRenderer extends Gui {

	private Minecraft mc = Minecraft.getMinecraft();
	
	public void Draw() {
		mc.fontRendererObj.drawString(Client.clientName, 1, 1, 0xffffff);
	}
	
}

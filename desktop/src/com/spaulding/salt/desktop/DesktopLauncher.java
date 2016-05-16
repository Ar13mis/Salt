package com.spaulding.salt.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.spaulding.salt.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Salt";
		config.useGL30 = false;
		config.width = 1080;
		config.height = 640;
		new LwjglApplication(new Main(), config);
	}
}

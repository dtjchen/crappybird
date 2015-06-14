package com.dcode.crappybird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dcode.crappybird.CBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Crappy Bird";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new CBGame(), config);
	}
}

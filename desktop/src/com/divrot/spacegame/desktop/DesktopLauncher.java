package com.divrot.spacegame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.divrot.spacegame.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MainGame(), config);

		config.title = "SpaceWarrior";
		config.width = MainGame.WIDTH;
		config.height = MainGame.HEIGHT;
	}
}

package com.divrot.spacegame.screens;

/**
 * Created by divrot on 19.11.16.
 */
public class ScreenManager {

    private static Screen currentScreen;

    public static void setScreen(Screen screen) {
        if (currentScreen != null)
            currentScreen.dispose();
        currentScreen = screen;
        currentScreen.create();
    }

    public static Screen getCurrentScreen() {
        return currentScreen;
    }
}

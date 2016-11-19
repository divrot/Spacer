package com.divrot.spacegame.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by divrot on 19.11.16.
 */
public abstract class Screen {

    public abstract void create();

    public abstract void update();

    public abstract void render(SpriteBatch spriteBatch);

    public abstract void resize(int wight, int height);

    public abstract void dispose();

    public abstract void hide();

    public abstract void pause();

    public abstract void resume();
}

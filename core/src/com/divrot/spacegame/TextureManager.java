package com.divrot.spacegame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by divrot on 19.11.16.
 */
public class TextureManager {

    public static Texture PLAYER = new Texture(Gdx.files.internal("player.png"));
    public static final Texture ENEMY = new Texture(Gdx.files.internal("enemy.png"));
    public static Texture MISSILE = new Texture(Gdx.files.internal("missile.png"));
    public static Texture GAME_OVER = new Texture(Gdx.files.internal("gameover.png"));
    public static Texture GAME_WON = new Texture(Gdx.files.internal("gamewon.png"));
}

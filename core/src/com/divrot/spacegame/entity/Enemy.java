package com.divrot.spacegame.entity;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.divrot.spacegame.MainGame;
import com.divrot.spacegame.TextureManager;

/**
 * Created by divrot on 19.11.16.
 */
public class Enemy extends Entity {

    public Enemy(Vector2 position, Vector2 direction) {
        super(TextureManager.ENEMY, position, direction);
    }

    @Override
    public void update() {
        position.add(direction);

        if (position.y <= -TextureManager.ENEMY.getHeight()) {
            float x = MathUtils.random(0, MainGame.WIDTH - TextureManager.ENEMY.getWidth());
            position.set(x, MainGame.HEIGHT);
        }
    }
}

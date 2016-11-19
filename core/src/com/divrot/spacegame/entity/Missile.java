package com.divrot.spacegame.entity;

import com.badlogic.gdx.math.Vector2;
import com.divrot.spacegame.MainGame;
import com.divrot.spacegame.TextureManager;

/**
 * Created by divrot on 19.11.16.
 */
public class Missile extends Entity {

    public Missile(Vector2 position) {
        super(TextureManager.MISSILE, position, new Vector2(0, 5));
    }

    @Override
    public void update() {
        position.add(direction);
    }

    public boolean checkEnd() {
        return position.y >= MainGame.HEIGHT;
    }

}

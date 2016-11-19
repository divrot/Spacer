package com.divrot.spacegame.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.divrot.spacegame.MainGame;
import com.divrot.spacegame.TextureManager;
import com.divrot.spacegame.camera.OrthoCamera;

/**
 * Created by divrot on 19.11.16.
 */
public class Player extends Entity {

    private final EntityManager entityManager;
    private final OrthoCamera camera;
    private long lastFire;

    public Player(Vector2 position, Vector2 direction, EntityManager entityManager, OrthoCamera camera) {
        super(TextureManager.PLAYER, position, direction);
        this.entityManager = entityManager;
        this.camera = camera;
    }

    @Override
    public void update() {
        position.add(direction);

        int dir = 0;
        if (Gdx.input.isTouched()) {
            Vector2 touch = camera.unprojectCoordinates(Gdx.input.getX(), Gdx.input.getY());
            if (touch.x > MainGame.WIDTH / 2)
                dir = 2;
            else
                dir = 1;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.A) || dir == 1) //left
            setDirection(-300, 0);
        else if (Gdx.input.isKeyPressed(Input.Keys.D) || dir == 2) //right
            setDirection(300, 0);
        else
            setDirection(0, 0);

        if (System.currentTimeMillis() - lastFire >= 350) { //
            entityManager.addEntity(new Missile(position.cpy().add(25, TextureManager.PLAYER.getHeight())));
            lastFire = System.currentTimeMillis();
        }
    }

}

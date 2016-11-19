package com.divrot.spacegame.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.divrot.spacegame.camera.OrthoCamera;
import com.divrot.spacegame.entity.EntityManager;

/**
 * Created by divrot on 19.11.16.
 */
public class GameScreen extends Screen {

    private OrthoCamera camera;
    private EntityManager entityManager;

    @Override
    public void create() {
        camera = new OrthoCamera();
        entityManager = new EntityManager(10, camera);
    }

    @Override
    public void update() {
        camera.update();
        entityManager.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        entityManager.render(sb);
        sb.end();
    }

    @Override
    public void resize(int width, int height) {
        camera.resize();
    }

    @Override
    public void dispose() {
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

}

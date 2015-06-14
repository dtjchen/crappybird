package com.dcode.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.dcode.gameworld.GameRenderer;
import com.dcode.gameworld.GameWorld;

public class GameScreen implements Screen {
    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();

        // Covert Frame rate to String, print it
        Gdx.app.log("GameScreen FPS", (1/delta) + "");
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resize()");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show()");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide()");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause()");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume()");
    }

    @Override
    public void dispose() {
        // Leave blank
    }
}

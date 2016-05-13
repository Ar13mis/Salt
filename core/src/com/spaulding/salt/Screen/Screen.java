package com.spaulding.salt.Screen;

import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by jared on 5/12/2016.
 */
public abstract class Screen {
    public abstract void create();

    public abstract void render(Stage stage);

    public abstract void resize(int width, int height);

    public abstract void dispose();

    public abstract void pause();

    public abstract void resume();
}

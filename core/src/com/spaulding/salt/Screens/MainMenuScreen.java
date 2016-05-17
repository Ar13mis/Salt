package com.spaulding.salt.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.spaulding.salt.Salt;

/**
 * Created by connor on 5/17/16.
 */
public class MainMenuScreen extends SaltScreen {
    public MainMenuScreen(Salt game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}

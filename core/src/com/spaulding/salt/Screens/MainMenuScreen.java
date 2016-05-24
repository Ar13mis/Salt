package com.spaulding.salt.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.spaulding.salt.Assets;
import com.spaulding.salt.Salt;

/**
 * Created by connor on 5/17/16.
 */
public class MainMenuScreen extends SaltScreen {
    Salt game;
    OrthographicCamera guiCam;
    Vector3 touchpoint;
    Rectangle play_bounds;

    private final float JAEPRA_DIAMERTER = 250, LUSTRAOPRA_DIAMETER = 500, GLATALIA_DIAMETER = 250;

    public MainMenuScreen(Salt game) {
        super(game);
        this.game = game;
        guiCam = new OrthographicCamera(1080,640);
        guiCam.position.set(1080 / 2, 640 / 2, 0);
        touchpoint = new Vector3();
        play_bounds = new Rectangle(1080 / 2, 640 / 2, 500, 500);
    }

    @Override
    public void render(float delta) {
        update();
        draw();
    }

    public void draw(){
        GL20 gl = Gdx.gl;
        gl.glClearColor(1, 0, 0 ,1);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        guiCam.update();
        game.batcher.setProjectionMatrix(guiCam.combined);

        game.batcher.disableBlending();
        game.batcher.begin();
        game.batcher.draw(Assets.background, 0, 0, 1080, 640);
        game.batcher.end();

        game.batcher.enableBlending();
        game.batcher.begin();
        game.batcher.draw(Assets.title,1080 / 2 - 650 / 2, 640 - 250);
        game.batcher.draw(Assets.jaepra,0,0);
        game.batcher.draw(Assets.lustraopra, 1080 / 2 - 500 / 2, 640 / 2 - 500 / 2);
        game.batcher.draw(Assets.glatalia, 100, 100);
        game.batcher.end();
    }

    public void update(){
        if(Gdx.input.isTouched()){
            guiCam.unproject(touchpoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));

            if (play_bounds.contains(touchpoint.x, touchpoint.y)){
                /*
                play button pressed
                set new screen to game screen
                 */
            }
        }
    }
}

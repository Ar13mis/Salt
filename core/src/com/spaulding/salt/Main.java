package com.spaulding.salt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.spaulding.salt.Screen.MenuScreen;
import com.spaulding.salt.Screen.ScreenManager;

public class Main implements ApplicationListener {
	Stage stage;
	
	@Override
	public void create () {
		stage = new Stage();
		ScreenManager.setScreen(new MenuScreen());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (ScreenManager.getCurrentScreen() != null){
			ScreenManager.getCurrentScreen().render(stage);
		}
	}

	@Override
	public void resize(int width, int height) {
		if (ScreenManager.getCurrentScreen() != null){
			ScreenManager.getCurrentScreen().resize(width,height);
		}
	}

	@Override
	public void pause() {
		if (ScreenManager.getCurrentScreen() != null){
			ScreenManager.getCurrentScreen().pause();
		}
	}

	@Override
	public void resume() {
		if (ScreenManager.getCurrentScreen() != null){
			ScreenManager.getCurrentScreen().resume();
		}
	}

	@Override
	public void dispose() {
		if (ScreenManager.getCurrentScreen() != null){
			ScreenManager.getCurrentScreen().dispose();
		}
	}
}

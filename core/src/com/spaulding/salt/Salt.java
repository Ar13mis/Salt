package com.spaulding.salt;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.spaulding.salt.Screens.MainMenuScreen;

public class Salt extends Game {
	public SpriteBatch batcher;

	@Override
	public void create() {
		batcher = new SpriteBatch();
		Assets.load();
		setScreen(new MainMenuScreen(this));
	}

	//SALT space around large terrestrial

	@Override
	public void render(){
		super.render();
	}
}

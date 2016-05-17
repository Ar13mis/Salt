package com.spaulding.salt;

import com.badlogic.gdx.Game;
import com.spaulding.salt.Screens.MainMenuScreen;

public class Salt extends Game {
	@Override
	public void create() {
		setScreen(new MainMenuScreen(this));
	}
}

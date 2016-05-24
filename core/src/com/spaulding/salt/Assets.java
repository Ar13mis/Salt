package com.spaulding.salt;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by jared on 5/17/2016.
 */
public class Assets {

    public static Texture jaepra, lustraopra, glatalia;
    public static Texture background, title;

    public static void load(){
        title = new Texture("title.png");
        background = new Texture("background.png");
        jaepra = new Texture("jaepra.png");
        lustraopra = new Texture("lustraopra.png");
        glatalia = new Texture("glatalia.png");
    }
}

package com.attila.horvath.tetris3D;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
			
		cfg.title = "Tetris3D";
		cfg.useGL20 = true;
		cfg.resizable = false;
				
//		cfg.fullscreen = true;
//		cfg.foregroundFPS = 60;
		
	    new LwjglApplication(new Root(), cfg);
	}
}

package com.attila.horvath.game;

import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;

public class GameEnvironment {
	private Environment environment;

	public GameEnvironment() {
		environment = new Environment();
        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1f));
        environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.8f, -0.2f));
        //environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, 1f, 0.8f, 0.2f));
	}
	
	public Environment getEnvironment() {
		return environment;
	}
	
}

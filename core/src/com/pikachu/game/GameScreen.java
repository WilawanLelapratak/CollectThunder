package com.pikachu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private PiKaChuGame piKaChuGame;
	private Texture piKaChuImg;
	private Texture bgImg;
	private int x;
	private int y;
	
	public GameScreen (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		piKaChuImg = new Texture("pikachu.png");
		bgImg = new Texture("background.png");
		x = 100;
		y = 100;
	}
	
	@Override
    public void render (float delta) {
        SpriteBatch batch = piKaChuGame.batch;
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update(delta);
        batch.begin();
        batch.draw(bgImg, 0, 0);
        batch.draw(piKaChuImg, x, y);
        batch.end();
    }

	public void update (float delta) {
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 5;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += 5;
        }
	}
}

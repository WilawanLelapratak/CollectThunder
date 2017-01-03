package com.pikachu.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private PiKaChuGame piKaChuGame;
	private Texture piKaChuImg;
	private int x;
	private int y;
	
	public GameScreen (PiKaChuGame piKaChuGame) {
		this.piKaChuGame = piKaChuGame;
		piKaChuImg = new Texture("pikachu.png");
		x = 100;
		y = 100;
	}
	
	@Override
    public void render(float delta) {
        SpriteBatch batch = piKaChuGame.batch;
        x += 5;
        batch.begin();
        batch.draw(piKaChuImg, x, y);
        batch.end();
        
    }

}

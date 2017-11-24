package com.zhang.shoot;

import java.util.Random;

public class Airpane extends FlyingObject implements Enemy {
	private int speed = 2;// 走步的步数

	public Airpane() {
		image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight();
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - this.width);
		y = -this.height;
	}

	@Override
	public int getScore() {
		return 5;
	}

	@Override
	public void step() {
		y += speed;
	}

	@Override
	public boolean outOfBounds() {
		return this.y > ShootGame.HEIGHT;
	}

}

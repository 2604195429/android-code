package com.zhang.shoot;

import java.util.Random;

public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;
	private int ySpeed = 2;
	private int awardType;

	public Bee() {
		image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
		y = -this.height;
		awardType = rand.nextInt(2);// 0火力值，1表示命
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return awardType;
	}

	@Override
	public void step() {
		y += ySpeed;
		x += xSpeed;
		if (x >= ShootGame.WIDTH - this.width) {
			xSpeed = -1;
		}
		if (x <= 0) {
			xSpeed = 1;
		}
	}

	@Override
	public boolean outOfBounds() {
		return this.y > ShootGame.HEIGHT;
	}

}

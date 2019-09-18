package com.monapp.model;

abstract class Being extends SpacialElement implements Movable {

	protected int maxSpeed = 1;

	@Override
	public boolean goUp(int speed) {
		if (speed <= maxSpeed) {
			x += speed;
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean goDown(int speed) {
		if (speed <= maxSpeed) {
			x -= speed;
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean goRight(int speed) {
		if (speed <= maxSpeed) {
			y += speed;
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean goLeft(int speed) {
		if (speed <= maxSpeed) {
			y -= speed;
			return true;
		}
		else
		return false;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	
	
}

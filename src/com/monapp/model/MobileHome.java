package com.monapp.model;

public class MobileHome extends House implements Movable {

	public MobileHome(int price, Emateriel emateriel, Human human) {
		super(price, emateriel, human);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean goUp(int speed) {
		x += speed;
		return true;
	}

	@Override
	public boolean goDown(int speed) {
		x -= speed;
		return true;
	}

	@Override
	public boolean goRight(int speed) {
		y += speed;
		return true;
	}

	@Override
	public boolean goLeft(int speed) {
		y -= speed;
		return true;
	}

	
	
}

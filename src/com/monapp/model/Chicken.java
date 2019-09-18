package com.monapp.model;

public class Chicken extends Animal implements Flying {

	@Override
	public String communicate() {
		String res = "Cock-a-doodle-doo";
		return res;
	}

	@Override
	public boolean takeOff() {
		if(inAir == false) {
			inAir = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean land() {
		if(inAir == true) {
			inAir = false;
			return true;
		}
		return false;
	}

}

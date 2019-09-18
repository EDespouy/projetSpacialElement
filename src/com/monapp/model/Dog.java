package com.monapp.model;

public class Dog extends Animal {

	@Override
	public String communicate() {
		String res = "Bark";
		return res;
	}

}

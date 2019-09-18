package com.monapp.model;

public class House extends SpacialElement {
	
	private int price;
	Emateriel emateriel;
	Human human;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public House(int price, Emateriel emateriel, Human human) {
		super();
		this.price = price;
		this.emateriel = emateriel;
		this.human = human;
	}
	
	
}

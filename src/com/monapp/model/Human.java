package com.monapp.model;

import java.util.ArrayList;
import java.util.List;

public class Human extends Being implements Adopter, Buyer {
	
	private int money;
	List<House> listHouse = new ArrayList<House>();
	List<Animal> listAnimal = new ArrayList<Animal>();

	@Override
	public boolean buy(House h) {
			if(h.human == null) {
				if(money >= h.getPrice()) {
					money -= h.getPrice();
					h.human = this;
					listHouse.add(h);
					return true;
				}
			}
		return false;
	}

	public Human(int money) {
		super();
		this.money = money;
	}
	public Human(int money, List<House> listHouse, List<Animal> listAnimal) {
		super();
		this.money = money;
		this.listHouse = listHouse;
		this.listAnimal = listAnimal;
	}


	@Override
	public void sell(House h) {
		for (int i = 0; i<listHouse.size(); i++) {
			if(listHouse.get(i).equals(h)) {
				money += h.getPrice();	
				h.human = null;
				listHouse.remove(h);
			}		
		}
	}

	@Override
	public boolean adopte(Animal a) {
			if(a.human == null) {
				listAnimal.add(a);
				a.human = this;
				return true;
			} 
			return false;
	}

	@Override
	public boolean revoke(Animal a) {
		for(int i = 0; i<listAnimal.size(); i++) {
			if(listAnimal.get(i).equals(a)) {
				a.human = null;
				listAnimal.remove(a);
				return true;
			}
		}
		return false;		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

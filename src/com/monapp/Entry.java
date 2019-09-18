package com.monapp;

import com.monapp.model.Chicken;
import com.monapp.model.Dog;
import com.monapp.model.Eagle;
import com.monapp.model.Emateriel;
import com.monapp.model.House;
import com.monapp.model.Human;

public class Entry {

	public static void main(String[] args) {
		
		Chicken chicken1 = new Chicken();	
		chicken1.setName("Jeanette");
		chicken1.setInAir(false);
		chicken1.setMaxSpeed(5);
		
		
		Eagle eagle1 = new Eagle();
		eagle1.setName("Thorondor");
		eagle1.setInAir(true);
		eagle1.setMaxSpeed(12);
		
		
		Dog dog1 = new Dog();
		dog1.setName("Pluto");
		dog1.setMaxSpeed(9);
		
		House house1 = new House(2000, Emateriel.Brick, null);
		
		
		Human human1 = new Human(150);
		Human human2 = new Human(5222);

		System.out.println(human1.adopte(chicken1));
		System.out.println(human2.buy(house1));

		System.out.println(human2.revoke(chicken1));
		System.out.println(human1.revoke(chicken1));
		
		System.out.println(chicken1.goUp(4));
		System.out.println(chicken1.goUp(5));
		
		

	}

}

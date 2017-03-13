package com.comp1011.lesson01;

public class Player {
	

	public static void main(String[] args) {
		
		int strength = 10;
		
		Person tom = new Person();
		
		System.out.println(tom.getWeight() + " lbs");
		tom.walks();
		System.out.println(tom.getWeight() + " lbs");
		tom.eats();
		System.out.println(tom.getWeight() + " lbs");
		
	}

}

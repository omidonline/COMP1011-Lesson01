package com.comp1011.lesson01;

public class Person {
	
	float height;
	float weight;

	public Person() {
		this.height = 6f;
		this.weight = 200f;
		this.walks();
	}

	public void walks() {
		float lostPercent = 0.9f;
		this.weight *= lostPercent;
	}

	public void eats() {
		float lostPercent = 1.2f;
		this.weight *= lostPercent;
	}

	public float getWeight() {
		return this.weight;
	}
}

package com.bee.builder;

public class Coke extends ColdDrink {

	public String name() {
		return "coke";
	}

	@Override
	public float price() {
		return 9.9f;
	}

}

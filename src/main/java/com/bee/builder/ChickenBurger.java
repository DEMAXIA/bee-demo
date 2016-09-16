package com.bee.builder;

public class ChickenBurger extends Burger {

	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 35.1f;
	}

}

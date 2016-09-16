package com.bee.builder;

public class Pepsi extends ColdDrink {

	public String name() {
		return "pepsi";
	}

	@Override
	public float price() {
		return 8.88f;
	}

}

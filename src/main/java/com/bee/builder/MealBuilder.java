package com.bee.builder;

/**
 * 创建者模式
 * 
 * @author Anni
 *
 */
public class MealBuilder {

	public Meal prepareVegMeal() {

		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());

		return meal;
	}

	public Meal prepareNonVegMeal() {

		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());

		return meal;

	}
}

package com.bee.builder;

public class BuilderMain {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg meal");
		vegMeal.showItem();
		System.out.println("total cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("non veg meal");
		nonVegMeal.showItem();
		System.out.println("totol cost: " + nonVegMeal.getCost());
	}
}

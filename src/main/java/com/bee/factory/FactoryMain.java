package com.bee.factory;

public class FactoryMain {

	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape("circle");
		shape1.draw();
	}
}

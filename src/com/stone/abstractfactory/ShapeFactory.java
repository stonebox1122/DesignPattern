package com.stone.abstractfactory;
public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}else if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color) {
		return null;
	}
}

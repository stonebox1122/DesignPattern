package com.stone.factory;
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		//获取 Circle 的对象，并调用它的 draw 方法
		shapeFactory.getShape("circle").draw();
		//获取 Rectangle 的对象，并调用它的 draw 方法
		shapeFactory.getShape("rectangle").draw();
		//获取 Square 的对象，并调用它的 draw 方法
		shapeFactory.getShape("square").draw();
	}
}
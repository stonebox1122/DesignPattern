package com.stone.factory;
public class ShapeFactory {
	//使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
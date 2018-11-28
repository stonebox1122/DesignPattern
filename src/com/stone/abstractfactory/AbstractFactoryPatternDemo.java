package com.stone.abstractfactory;
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		//获取形状为rectangle的对象
		Shape rectangle = shapeFactory.getShape("rectangle");
		//调用rectangle的draw方法
		rectangle.draw();
		//获取形状为square的对象
		Shape square = shapeFactory.getShape("square");
		//调用square的draw方法
		square.draw();
		//获取形状为circle的对象
		Shape circle = shapeFactory.getShape("circle");
		//调用cirlce的draw方法
		circle.draw();
		
		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		//获取颜色为red的对象
		Color red = colorFactory.getColor("red");
		//调用red的fill方法
		red.fill();
		//获取颜色为green的对象
		Color green = colorFactory.getColor("green");
		//调用green的fill方法
		green.fill();
		//获取颜色为blue的对象
		Color blue = colorFactory.getColor("blue");
		//调用blue的fill方法
		blue.fill();
	}
}

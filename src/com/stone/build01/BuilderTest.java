package com.stone.build01;

public class BuilderTest {
    public static void main(String[] args) {
        CarDirector director = new AudiDirector(new AudiBuilder());
        Car car = director.directCar();
    }
}

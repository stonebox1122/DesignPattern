package com.stone.abstractfactory01;

public class HighCar implements CarFactory {
    @Override
    public HighEngine createEngine() {
        return new HighEngine();
    }

    @Override
    public HighTyre createTyre() {
        return new HighTyre();
    }
}

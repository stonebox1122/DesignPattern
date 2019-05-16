package com.stone.abstractfactory01;

public class LowCar implements CarFactory {
    @Override
    public EngineFactory createEngine() {
        return new LowEngine();
    }

    @Override
    public TyreFactory createTyre() {
        return new LowTyre();
    }
}

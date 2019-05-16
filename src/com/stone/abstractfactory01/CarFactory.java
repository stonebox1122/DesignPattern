package com.stone.abstractfactory01;

public interface CarFactory {
    EngineFactory createEngine();
    TyreFactory createTyre();
}

package com.stone.abstractfactory01;

public class HighEngine implements EngineFactory {
    @Override
    public void autoStart() {
        System.out.println("高端发动机有自动启停功能");
    }
}

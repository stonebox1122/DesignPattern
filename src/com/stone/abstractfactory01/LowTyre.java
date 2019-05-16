package com.stone.abstractfactory01;

public class LowTyre implements TyreFactory {
    @Override
    public void monitor() {
        System.out.println("低端轮胎无监控胎压功能");
    }
}

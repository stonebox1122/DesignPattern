package com.stone.simplefactory;

public class SimpleFactory {
    public  Car getAudi(){
        return new Audi();
    }
    public  Car getBenz(){
        return new Benz();
    }
}

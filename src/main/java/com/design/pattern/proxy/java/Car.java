package com.design.pattern.proxy.java;

public class Car implements IVehical {
    @Override
    public void run() {
        System.out.println("Car会跑");
    }
}
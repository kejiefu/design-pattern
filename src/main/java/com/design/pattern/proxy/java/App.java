package com.design.pattern.proxy.java;

import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {
        IVehical car = new Car();
        System.out.println(car.getClass());
        System.out.println(Car.class.getInterfaces());
        IVehical vehical = (IVehical) Proxy.newProxyInstance(car.getClass().getClassLoader(), Car.class.getInterfaces(), new VehicalInvacationHandler(car));
        vehical.run();
    }
}

package com.lambda.supplier.sample;

public class CarService {

    static boolean check(CarInterface ti, int b) {

        return ti.execute(b);

    }

}
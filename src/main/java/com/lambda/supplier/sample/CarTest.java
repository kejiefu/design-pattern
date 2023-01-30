package com.lambda.supplier.sample;

/**
 * @author: kejiefu
 * @create: 2023-01-30 14:06
 **/
public class CarTest {

    public static void main(String arg[]) {

        boolean result = CarService.check((x) -> (x % 2) == 0, 10);

        System.out.println("The result is: " + result);

    }


}

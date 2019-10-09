package com.lambda.supplier;

import java.util.function.Supplier;

/**
 * @Auther kejiefu
 * @Date 2019/10/9 0009
 * 供给型接口	Supplier<T>	 参数 :None	返回值:T,desc:	没有输入，返回一个对象T
 */


public class Test {


    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());


    }

}

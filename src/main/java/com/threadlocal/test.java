package com.threadlocal;

/**
 * @author kejiefu
 * @Description TODO
 * @Date 2021/2/19 16:53
 * @Created by kejiefu
 */
public class test {

    private static final ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        stringThreadLocal.set("abc");
        t();
    }


    private static void t() {
        System.out.println(stringThreadLocal.get());
        stringThreadLocal.remove();
        System.out.println(stringThreadLocal.get());
    }

}

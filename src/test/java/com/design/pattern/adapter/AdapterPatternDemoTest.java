package com.design.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther kejiefu
 * @Date 2019/9/25 0025
 */
public class AdapterPatternDemoTest {

    private static final ThreadLocal<Integer> TL_INT = ThreadLocal.withInitial(() -> 6);
    private static final ThreadLocal<String> TL_STRING = ThreadLocal.withInitial(() -> "Hello, world");

    public static void main(String... args) {
        // 6
        System.out.println(TL_INT.get());
        TL_INT.set(TL_INT.get() + 1);
        // 7
        System.out.println(TL_INT.get());
        TL_INT.remove();
        // 会重新初始化该value，6
        System.out.println(TL_INT.get());


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        for(Map.Entry<String, Object> entry :map.entrySet()){
            System.out.println(entry.getKey()+"::::"+entry.getValue());
        }

    }


}

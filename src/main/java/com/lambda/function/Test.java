package com.lambda.function;


import com.lambda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 功能型函数式接口	Function<T, R>	参数：T	返回值：R,desc:   对象转换，T->R
 *
 * @Auther kejiefu
 * @Date 2019/10/9 0009
 */
public class Test {

    public static void main(String[] args) {
        Function<String, Long> fun = str -> convert(str);
        Long f = fun.apply("2");
        System.out.println(f);



        User user = new User();
        user.setId(1);
        user.setName("1");
        User user2 = new User();
        user2.setId(2);
        user2.setName("2");
        User user3 = new User();
        user3.setId(3);
        user3.setName("3");
        List<User> arrayList = new ArrayList<>();
        arrayList.add(user);
        arrayList.add(user2);
        arrayList.add(user3);

        List<String> result = arrayList.stream()
                .map(t -> t.getName()).collect(Collectors.toList());
        System.out.println(result);


    }


    private static Long convert(String string) {
        return Long.valueOf(string);
    }
}

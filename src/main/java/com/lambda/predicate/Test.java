package com.lambda.predicate;

import com.lambda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther kejiefu
 * @Date 2019/10/9 0009
 * 断言型接口	Predicate<T>	参数:T	返回值:boolean	desc:进行逻辑判断，返回boolean值
 */
public class Test {


    public static void main(String[] args) {
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

        List<User> result = arrayList.stream()
                .filter(t -> t.getId() != 1).collect(Collectors.toList());
        System.out.println(result);

    }

}

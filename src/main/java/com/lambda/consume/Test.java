package com.lambda.consume;

import com.lambda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther kejiefu
 * @Date 2019/10/9 0009
 * 消费型接口	Consumer<T>	参数:T	返回值:void	desc:改变对象T内部属性的值
 */
public class Test {


    public static void main(String[] args) {
        User user4 = new User();
        user4.setId(4);
        user4.setName("4");
        User user1 = new User();
        user1.setId(1);
        user1.setName("1");
        User user2 = new User();
        user2.setId(2);
        user2.setName("2");
        User user3 = new User();
        user3.setId(3);
        user3.setName("3");
        List<User> arrayList = new ArrayList<>();
        arrayList.add(user4);
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);

        arrayList.forEach(t -> {
            if (t.getId().equals(1)) {
                t.setName("3");
            }
        });

        for (User u : arrayList) {
            System.out.println(u.getId() + "," + u.getName());
        }

        List<User> arrayList1 = arrayList.stream().sorted((a, b) -> a.getId() - b.getId()).collect(Collectors.toList());

        for (User u : arrayList1) {
            System.out.println(u.getId() + "," + u.getName());
        }

    }


}

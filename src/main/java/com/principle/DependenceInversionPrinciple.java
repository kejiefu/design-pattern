package com.principle;

/**
 * 依赖倒置原则
 * 依赖倒置原则的主要作用如下。
 * 依赖倒置原则可以降低类间的耦合性。
 * 依赖倒置原则可以提高系统的稳定性。
 * 依赖倒置原则可以减少并行开发引起的风险。
 * 依赖倒置原则可以提高代码的可读性和可维护性。
 * <p>
 * 依赖倒置原则的实现方法
 * 依赖倒置原则的目的是通过要面向接口的编程来降低类间的耦合性，所以我们在实际编程中只要遵循以下4点，就能在项目中满足这个规则。
 * 每个类尽量提供接口或抽象类，或者两者都具备。
 * 变量的声明类型尽量是接口或者是抽象类。
 * 任何类都不应该从具体类派生。
 * 使用继承时尽量遵循里氏替换原则。
 *
 * @Auther kejiefu
 * @Date 2019/10/12 0012
 */
public class DependenceInversionPrinciple {

    public static void main(String[] args) {
        Customer wang = new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new ShaoguanShop());
        wang.shopping(new WuyuanShop());
    }
}

//商店
interface Shop {
    String sell(); //卖
}

//任何类都不应该从具体类派生。
//韶关网店
class ShaoguanShop implements Shop {
    public String sell() {
        return "韶关土特产：香菇、木耳……";
    }
}

//婺源网店
class WuyuanShop implements Shop {
    public String sell() {
        return "婺源土特产：绿茶、酒糟鱼……";
    }
}

//顾客
class Customer {

    //变量的声明类型尽量是接口或者是抽象类。
    public void shopping(Shop shop) {
        //购物
        System.out.println(shop.sell());
    }
}
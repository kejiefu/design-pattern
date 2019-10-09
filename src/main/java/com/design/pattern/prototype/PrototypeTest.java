package com.design.pattern.prototype;

class A {
    private Integer name;

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }
}

class RealizeType implements Cloneable {

    private A a;

    public com.design.pattern.prototype.A getA() {
        return a;
    }

    public void setA(com.design.pattern.prototype.A a) {
        this.a = a;
    }

    RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}

//原型模式的测试类
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        String bbb = "";
        A a = new A();
        a.setName(123);
        obj1.setA(a);
        RealizeType obj2 = (RealizeType) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1.getA().getName()));
        System.out.println("obj1==obj2?" + (obj2.getA()).getName());
        a.setName(1234);
        System.out.println("obj1==obj2?" + (obj1.getA().getName()));
        System.out.println("obj1==obj2?" + (obj2.getA()).getName());
        System.out.println("obj1==obj2?" + (obj1.getA() == obj2.getA()));
    }
}
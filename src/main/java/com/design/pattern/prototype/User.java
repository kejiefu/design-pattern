package com.design.pattern.prototype;

/**
 * @Auther kejiefu
 * @Date 2019/10/8 0008
 */
public class User implements Cloneable {

    private static final long serialVersionUID = -4592529956472231230L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (User)super.clone();
    }
}

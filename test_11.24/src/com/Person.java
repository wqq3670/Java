package com;

/**
 * Created with IntelliJ IDEA.
 * Description:  Person类 实现 Cloneable接口（带引用类型）
 * User: dell
 * Date: 2019-11-24
 * Time: 10:15
 **/
public class Person implements Cloneable{
    public String name;
    public Money money;

    public Person() {
        this.money = new Money();
    }

    /**
     * 当前类包含了引用类型 money
     * 在Person 的clone方法内，不仅要克隆自己本身，还要克隆money
     * @return
     * @throws CloneNotSupportedException
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person per = (Person) super.clone();
        per.money = (Money) money.clone();
        return per;
    }
}

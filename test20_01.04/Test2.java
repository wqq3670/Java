package com;

/**
 * Created with IntelliJ IDEA.
 * Description: Cloneable 接口的测试代码
 * User: dell
 * Date: 2019-11-24
 * Time: 10:15
 **/
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException { //声明一下异常
        Person person = new Person();
        Person person1 = (Person) person.clone();
        System.out.println(person.money.m);
        System.out.println(person1.money.m);
        System.out.println("===========我是分割线=============");
        person1.money.m = 199.4;
        System.out.println(person.money.m);
        System.out.println(person1.money.m);
    }
}

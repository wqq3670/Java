package com;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-21
 * Time: 21:42
 **/
public class Cat extends Animal{
    public String sex;

    public Cat(String name, String sex) {
        super(name);
        this.sex = sex;
    }
    public void jump() {
        System.out.println(this.name+"jump()");
    }
    public void eat() {
        System.out.println(this.name+"Cat::eat()");
    }
}

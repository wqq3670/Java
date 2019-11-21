package com;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-21
 * Time: 21:42
 **/
public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name+"fly()");
    }
}

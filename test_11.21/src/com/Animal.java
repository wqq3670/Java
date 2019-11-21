package com;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-21
 * Time: 21:42
 **/
public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name+"Animal::eat()");
    }
}

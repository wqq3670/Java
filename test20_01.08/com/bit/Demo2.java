package com.bit;

import com.bit.demo1.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-18
 * Time: 20:39
 **/
public class Demo2 extends Animal {
    //int stuNum = 412;
    public Demo2(String name) {
        super(name);
    }
    public void func1() {
        System.out.println(this.name);//protected类要这样访问
                            //this代表Demo2对象的引用
                  // （通过我自己的引用访问我继承过来的name）
    }

    public static void main(String[] args) {
        //Animal animal = new Animal("11");
        //System.out.println(animal.name);//通过animal对象来访问，
                // 其实访问的是animal自己对象的name,Demo2根本看不到

                        // public类的可以这样访问
                        //protected类的不可以
    }
}

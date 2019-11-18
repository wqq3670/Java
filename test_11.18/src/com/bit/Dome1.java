package com.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-18
 * Time: 20:39
 **/
public class Dome1 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();

        System.out.println(demo2.stuNum);//包访问权限—》
                                        // 只能同一个包中的可以访问
    }
}

package com.bit;


//import java.util.Arrays;
//import java.util.Date;

//上面两个可以写为

import java.util.*;//导入until下的所有包

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-18
 * Time: 20:16
 **/
public class TestDome1 {
    public static void main(String[] args) {

        int[] array = {1,2,3,5,6,8} ;
        System.out.println(Arrays.toString(array));

        Date date = new Date();
        //java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());
    }
}

package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-08
 * Time: 15:19
 **/
public class TestDemo5 {
    public static List<Character> func(String str1, String str2) {
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(str1.charAt(i) + "")) {
                ret.add(str1.charAt(i));
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> list = func(str1,str2);
        System.out.println(list);
    }
}

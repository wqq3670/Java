package com;

import com.Book.BookList;
import com.User.Admin;
import com.User.NormalUser;
import com.User.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:39
 **/
public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1：管理员 0：普通用户");
        int who = scanner.nextInt();
        if(who == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();

        //登录  返回子类对象Admin or NormalUser
        // 用父类引用user接收（向上转型）
        User user = login();

        while(true) {
            int choice = user.menu();//发生运行时绑定
            //对应操作
            user.doOperation(choice,bookList);
        }

    }
}

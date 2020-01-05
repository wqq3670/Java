package com.User;

import com.Operation.BorrowOperation;
import com.Operation.ExitOperation;
import com.Operation.IOperation;
import com.Operation.ReturnOperation;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:38
 **/
public class NormalUser extends User{
    public NormalUser(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new ExitOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=========================");
        System.out.println("hello "+this.name+",欢迎使用图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;

    }
}

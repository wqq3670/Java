package com.Operation;

import com.Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:37
 **/
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}

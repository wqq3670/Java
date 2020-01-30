package com.User;

import com.Book.BookList;
import com.Operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:39
 **/
abstract public class User {
    public String name;
    //IOperation-->实现了这个接口的类都可以存放进去
    public IOperation[] operations;

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }


}

package com.Operation;

import com.Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:37
 **/
public class DisplayOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}

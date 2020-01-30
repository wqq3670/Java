package com.Operation;

import com.Book.Book;
import com.Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:38
 **/
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("输入要查找的书名：");
        String name = scan.next();
        int i = 0;
        Book book = null;
        //遍历bookList的数组
        for (; i < bookList.getUsedSize(); i++) {
            book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("此书籍不存在");
            return;
        }
        book = bookList.getBooks(i);
        System.out.println(book);
        System.out.println("找到此书籍");
    }
}

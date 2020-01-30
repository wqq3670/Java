package com.Operation;

import com.Book.Book;
import com.Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:37
 **/
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        System.out.println("输入要借阅的书名：");
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
        book =  bookList.getBooks(i);
        if(book.isBorrowed()) {//true情况
            System.out.println("此书已经被借出去");
        }else {//false情况
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}

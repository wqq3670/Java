package com.Operation;

import com.Book.Book;
import com.Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-24
 * Time: 11:38
 **/
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        //查找图书是否存在
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
        if(book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("此书归还成功");
        }else {
            System.out.println("该出没有被借阅");
        }
    }
}

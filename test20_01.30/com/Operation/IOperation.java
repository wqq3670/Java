package com.Operation;

import com.Book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(BookList bookList);
}

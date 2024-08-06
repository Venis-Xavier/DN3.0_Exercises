package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration
        System.out.println("BookService is configured: " + (bookService != null));
        System.out.println("BookRepository is injected: " + (bookService.getBookRepository() != null));
    }
}
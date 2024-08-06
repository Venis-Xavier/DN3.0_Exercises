package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class BookService {
    private BookRepository bookRepository ;

    public void performService() {
        System.out.println("Service is performed.");
        this.bookRepository = new BookRepository();
        bookRepository.doSomething();
    }
}


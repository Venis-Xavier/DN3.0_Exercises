package com.bookstore.bookstoreapi.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private Long id;
    private String title;
    private String author;
    private double price;
    private String isbn;

    public Book(Long id, String title, String author, double price, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
}

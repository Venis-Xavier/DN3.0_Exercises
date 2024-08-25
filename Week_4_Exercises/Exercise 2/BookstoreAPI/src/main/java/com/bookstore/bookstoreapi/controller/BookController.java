package com.bookstore.bookstoreapi.controller;

import com.bookstore.bookstoreapi.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        books.add(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book) {
        books.set(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@RequestBody Book book) {
        books.remove(book);
    }
}

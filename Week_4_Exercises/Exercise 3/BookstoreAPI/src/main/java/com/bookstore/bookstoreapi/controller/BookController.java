package com.bookstore.bookstoreapi.controller;

import com.bookstore.bookstoreapi.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return new ArrayList<>(this.books);
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





    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);

    }

    @GetMapping
    public Book searchBooks(@RequestParam String title,
                            @RequestParam String author){
        return books.stream()
                .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title))
                                &&
                                (author == null) || book.getAuthor().equalsIgnoreCase(author))
                .findFirst()
                .orElse(null);

    }

}

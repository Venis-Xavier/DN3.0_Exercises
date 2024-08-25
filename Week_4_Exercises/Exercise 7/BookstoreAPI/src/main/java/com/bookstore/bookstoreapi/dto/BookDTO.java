package com.bookstore.bookstoreapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class BookDTO {
    @JsonProperty("bookTitle")
    private String title;
    @JsonProperty("bookAuthor")
    private String author;

    private String isbn;
    private String publisher;
    private String price;
}
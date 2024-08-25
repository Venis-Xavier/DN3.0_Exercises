package com.bookstore.bookstoreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
}

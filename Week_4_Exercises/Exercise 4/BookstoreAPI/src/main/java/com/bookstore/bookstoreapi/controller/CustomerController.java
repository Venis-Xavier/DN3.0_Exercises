package com.bookstore.bookstoreapi.controller;

import com.bookstore.bookstoreapi.entity.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping("/json")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customer;
    }

    @PostMapping("/register")
    public Customer registerCustomer(@ModelAttribute Customer customer) {
        return customer;
    }
}
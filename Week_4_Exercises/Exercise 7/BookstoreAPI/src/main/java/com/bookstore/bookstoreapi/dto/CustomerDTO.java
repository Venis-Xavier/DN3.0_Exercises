package com.bookstore.bookstoreapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class CustomerDTO {
    private Long id;
    @JsonProperty("customerName")
    private String name;

    private String email;
    private String phone;

}

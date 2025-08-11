package com.ordermanagement.grocery_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String address;
    private String phone;

    @JsonIgnore // This annotation breaks the infinite loop
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
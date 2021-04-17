package com.example.demo;

import org.springframework.data.repository.CrudRepository;


// CRUD
// Create Read Update Delete

public interface PizzaAction extends CrudRepository<Pizza, Integer> {
}

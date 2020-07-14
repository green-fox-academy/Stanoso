package com.greenfoxacademy.connectwithmysql.repositories;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository <Todo, Long> {

    void deleteById(Long id);
    Todo getById(Long id);

    @Query("SELECT c FROM Todo c WHERE c.title LIKE %:search% OR c.description LIKE %:search% ")
    List<Todo> findSearch(String search);

}

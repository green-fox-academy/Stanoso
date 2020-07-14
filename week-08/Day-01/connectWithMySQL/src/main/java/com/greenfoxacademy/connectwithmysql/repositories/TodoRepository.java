package com.greenfoxacademy.connectwithmysql.repositories;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <Todo, Long> {
}

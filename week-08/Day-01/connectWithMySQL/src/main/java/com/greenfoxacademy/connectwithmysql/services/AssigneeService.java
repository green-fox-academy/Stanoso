package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AssigneeService {

    List<Assignee> findAll();
}

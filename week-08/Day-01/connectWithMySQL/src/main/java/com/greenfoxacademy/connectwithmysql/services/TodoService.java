package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
public interface TodoService {

    List<Todo> findAll();

    void save(String newtodo, boolean urgent,String description);

    void saveWithAssignee(String newtodo, boolean urgent, String description, Assignee assignee);

    void edit(Long id, String newtodo, boolean urgent, boolean done, String description, String date);

    void deleteById (Long id);

    Todo getById(Long id);

    List<Todo> findSearch (String search);

    List<Todo> getByUrgent(boolean urgent);

    List<Todo> getByDone(boolean done);

}

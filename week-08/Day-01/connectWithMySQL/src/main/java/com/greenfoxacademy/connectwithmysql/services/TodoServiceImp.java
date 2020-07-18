package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
public class TodoServiceImp implements TodoService {
    TodoRepository todoRepository;

    @Autowired
    public TodoServiceImp(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public List<Todo> findAll() {
        return (List<Todo>) this.todoRepository.findAll();
    }

    @Override
    public void save(String newtodo, boolean urgent, String description) {
        Todo saveNew = new Todo(newtodo, urgent, description);
        this.todoRepository.save(saveNew);
    }

    @Override
    public void saveWithAssignee(String newtodo, boolean urgent, String description, Assignee assignee) {
        Todo saveNew = new Todo(newtodo, urgent, description, assignee);
        this.todoRepository.save(saveNew);
    }

    @Override
    public void edit(Long id, String newtodo, boolean urgent, boolean done, String description, String date) {
        Todo edited = new Todo(id, newtodo, urgent, done, description, date);
        this.todoRepository.save(edited);
    }

    @Override
    public void deleteById(Long id) {
        this.todoRepository.deleteById(id);
    }

    @Override
    public Todo getById(Long id) {
        return this.todoRepository.getById(id);
    }

    @Override
    public List<Todo> findSearch(String search) {
        return this.todoRepository.findSearch(search);
    }

    @Override
    public List<Todo> getByUrgent(boolean urgent) {
        return this.todoRepository.getByUrgent(urgent);
    }

    @Override
    public List<Todo> getByDone(boolean done) {
        return this.todoRepository.getByDone(done);
    }

    @Override
    public void editByAssigneeId(Long assigneeId) {
        this.todoRepository.deleteForeignKey(assigneeId);
    }
}

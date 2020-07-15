package com.greenfoxacademy.connectwithmysql.models;

import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private boolean urgent;
    private boolean done;

    @ManyToOne
    @JoinColumn(name="assigneeId")
    private Assignee assignee;



    public Todo () {}

    public Todo (String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.description = "";
    }

    public Todo(long id, String title, boolean urgent, boolean done, String description) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.description = description;
    }

    public Todo(String title, boolean urgent, String description) {
        this.title = title;
        this.urgent = urgent;
        this.done = false;
        this.description = description;
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.description = "";
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //    public List<Todo> getAll () {
//        List<Todo> list = new ArrayList<>();
//        this.todoRepository.findAll().forEach(list::add);
//        return list;
//    }
//
//    public void addNewToDo (String todo) {
//        Todo newTodo = new Todo(todo);
//        this.todoRepository.save(newTodo);
//    }
}

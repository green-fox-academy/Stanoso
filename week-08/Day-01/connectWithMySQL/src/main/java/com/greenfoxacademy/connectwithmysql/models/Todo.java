package com.greenfoxacademy.connectwithmysql.models;

import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private boolean urgent;
    private boolean done;
    @Temporal(value = TemporalType.DATE)
    private Date date;
    private String finish;

    @ManyToOne
    @JoinColumn(name = "assigneeId")
    private Assignee assignee;

    public Todo(Assignee assignee) {
        this.assignee = assignee;
    }

    public Todo() {
        this.date = new Date();
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.description = "";
        this.date = new Date();
    }

    public Todo(long id, String title, boolean urgent, boolean done, String description, String date) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.description = description;
        this.date = new Date();
        this.finish = date;
    }

    public Todo(String title, boolean urgent, String description, Assignee assignee) {
        this.title = title;
        this.urgent = urgent;
        this.done = false;
        this.description = description;
        this.date = new Date();
        this.assignee = assignee;
    }

    public Todo(String title, boolean urgent, String description) {
        this.title = title;
        this.urgent = urgent;
        this.done = false;
        this.description = description;
        this.date = new Date();
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.description = "";
        this.date = new Date();
    }

    public Todo(long id, String title, String description, boolean urgent, boolean done, Date date, String finish, Assignee assignee) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.urgent = urgent;
        this.done = done;
        this.date = date;
        this.finish = finish;
        this.assignee = assignee;
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

    public Date getDate() {
        return date;
    }

        public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }


}

package com.greenfoxacademy.connectwithmysql.models;

import com.greenfoxacademy.connectwithmysql.repositories.AssigneeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="assignee")
public class Assignee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany (mappedBy = "assignee")
    private List<Todo> todoList;

    public Assignee () {}

    public Assignee (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Assignee(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

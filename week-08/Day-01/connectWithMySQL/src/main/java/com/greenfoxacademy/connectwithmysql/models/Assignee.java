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


}

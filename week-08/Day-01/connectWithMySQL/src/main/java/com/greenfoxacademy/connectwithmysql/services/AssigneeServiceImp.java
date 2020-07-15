package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.repositories.AssigneeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AssigneeServiceImp implements AssigneeService {

    private AssigneeRepository assigneeRepository;

    public AssigneeServiceImp (AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Assignee> findAll() {
        return (List<Assignee>) this.assigneeRepository.findAll();
    }
}

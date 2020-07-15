package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AssigneeServiceImp implements AssigneeService {

    AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Assignee> findAll() {
        return (List<Assignee>) this.assigneeRepository.findAll();
    }

    @Override
    public void addAssignee(String name, String email) {
        this.assigneeRepository.save(new Assignee(name, email));
    }

    @Override
    public void deleteAssigneeById(Long id) {
        this.assigneeRepository.deleteById(id);
    }

    @Override
    public Assignee getById(Long id) {
        return this.assigneeRepository.getById(id);
    }

    @Override
    public void editAssignee(Long id, String name, String email) {
        Assignee edited = new Assignee(id, name, email);
        this.assigneeRepository.save(edited);
    }

    @Override
    public List<Assignee> findInAssignne(String search) {
        return this.assigneeRepository.findSearchInAssignee(search);
    }

}

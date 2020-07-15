package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AssigneeService {

    List<Assignee> findAll();
    void addAssignee (String name, String email);
    void deleteAssigneeById (Long id);
    Assignee getById (Long id);
    void editAssignee (Long id, String name, String email);
    List<Assignee> findInAssignne (String search);
    Boolean checkAssigneeExists(String name, String email);
    List<String> getNameAndEmail ();
    Long getIdByNameAndEmail (String nameemail);
}

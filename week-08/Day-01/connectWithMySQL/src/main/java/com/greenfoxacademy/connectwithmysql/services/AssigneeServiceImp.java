package com.greenfoxacademy.connectwithmysql.services;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class AssigneeServiceImp implements AssigneeService {

    AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public AssigneeServiceImp() {

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



    @Override
    public Boolean checkAssigneeExists(String name, String email) {
        return  getNameAndEmail().stream().anyMatch(e -> e.equals(name + ", "+ email));
    }

    @Override
    public List<String> getNameAndEmail () {
        List<Assignee> list = findAll();
        List<String> listNameEmail = new ArrayList<>();
        for (Assignee a : list) {
            listNameEmail.add(a.getName() + ", "+ a.getEmail());
        }
        return listNameEmail;
    }

    @Override
    public Long getIdByNameAndEmail(String nameemail) {
        String[] splitted = nameemail.split(", ");
        String name = splitted[0];
        String email = splitted[1];
//        List<Assignee> list = findAll();
//        Long id = list.stream().filter(a -> a.getName().toUpperCase().equals(name.toUpperCase()))
//                     .filter(a -> a.getEmail().toUpperCase().equals(email.toUpperCase()))
//                     .findAny()
//                     .get()
//                     .getId();
        return this.assigneeRepository.getIdByNameAndEmail(name,email);
    }
}

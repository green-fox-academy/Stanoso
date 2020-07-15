package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectwithmysql.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AssigneeController {

    public AssigneeService assigneeService;

    public AssigneeController (AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping ("/list-assignees")
    public String listAssignees (Model model) {
        List<Assignee> list = new ArrayList<>();
        this.assigneeService.findAll().forEach(list::add);
        model.addAttribute("assignees", list);
        return "assigneelist";
    }



}

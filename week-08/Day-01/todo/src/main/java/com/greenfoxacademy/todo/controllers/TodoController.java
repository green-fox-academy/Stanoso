package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController (TodoRepository todoRepository) {
        this.todoRepository =  todoRepository;
    }

    Todo toDo1 = new Todo("Feed the monkey");
    Todo toDo2 = new Todo("Walk the monkey");
    Todo toDo3 = new Todo("Let the monkey mate", true, false);



    @GetMapping (value = {"/","/list"})
    public String list (Model model) {
        this.todoRepository.save(toDo1);
        this.todoRepository.save(toDo2);
        this.todoRepository.save(toDo3);
        List<Todo> list = new ArrayList<>();
        this.todoRepository.findAll().forEach(list::add);
        model.addAttribute("todos", list);
        return "todolist";
    }

}

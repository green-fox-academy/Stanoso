package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
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

//    Todo toDo1 = new Todo("Feed the monkey");
//    Todo toDo2 = new Todo("Walk the monkey");
//    Todo toDo3 = new Todo("Let the monkey mate", true, false);
//    Todo toDo4 = new Todo("Make bed", false, false);
//    Todo toDo5 = new Todo("Wash myself", true, false);
//    Todo toDo6 = new Todo("Tidy up", true, true);
//    Todo toDo7 = new Todo("Buy milk", true, false);
//    Todo toDo8 = new Todo("See mum", true, true);
//    Todo toDo9 = new Todo("Feed the dog", true, true);
//    Todo toDo10 = new Todo("Cut the grass", true, false);
//    Todo toDo11 = new Todo("Call George", false, true);
//    Todo toDo12 = new Todo("Comb my beard", true, false);
//    Todo toDo13 = new Todo("Repair the gate", false, false);
//    Todo toDo14 = new Todo("Rearange the room", true, true);
//    Todo toDo15 = new Todo("Sit down", true, false);



    @GetMapping (value = {"/","/list"})
    public String list (Model model) {
//        this.todoRepository.save(toDo1);
//        this.todoRepository.save(toDo2);
//        this.todoRepository.save(toDo3);
//        this.todoRepository.save(toDo4);
//        this.todoRepository.save(toDo5);
//        this.todoRepository.save(toDo6);
//        this.todoRepository.save(toDo7);
//        this.todoRepository.save(toDo8);
//        this.todoRepository.save(toDo9);
//        this.todoRepository.save(toDo10);
//        this.todoRepository.save(toDo11);
//        this.todoRepository.save(toDo12);
//        this.todoRepository.save(toDo13);
//        this.todoRepository.save(toDo14);
//        this.todoRepository.save(toDo15);

        List<Todo> list = new ArrayList<>();
        this.todoRepository.findAll().forEach(list::add);
        model.addAttribute("todos", list);
        return "todolist";
    }

}

package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController (TodoRepository todoRepository) {
        this.todoRepository =  todoRepository;
    }





    @GetMapping (value = {"/","/list"})
    public String list (Model model) {
        List<Todo> list = new ArrayList<>();
        this.todoRepository.findAll().forEach(list::add);
        model.addAttribute("todos", list);
        return "todolist";
    }

    @GetMapping ("/todo/add")
    public String gotoNewTodo () {
        return "add";
    }

    @PostMapping("/todo/add")
    public String addNewTodo (@RequestParam String newtodo, @RequestParam String description, @RequestParam boolean urgent, Model model) {
        Todo toDo = new Todo(newtodo, urgent, description);
        this.todoRepository.save(toDo);
        return "redirect:/list";
    }

    @GetMapping ("{idOfTodo}/delete")
    public String deleteToDo (@PathVariable Long idOfTodo, Model model) {
        this.todoRepository.deleteById(idOfTodo);
        return "redirect:/list";
    }

    @GetMapping ("{idOfTodo}/edit")
    public String editToDo(Model model, @PathVariable Long idOfTodo) {
        model.addAttribute("id",idOfTodo);
        model.addAttribute("toDoTitle",this.todoRepository.getById(idOfTodo).getTitle());
        model.addAttribute("urgent",this.todoRepository.getById(idOfTodo).isUrgent());
        model.addAttribute("done",this.todoRepository.getById(idOfTodo).isDone());
        model.addAttribute("description",this.todoRepository.getById(idOfTodo).getDescription());
        return "edit";
    }

    @PostMapping("/{idOfTodo}/edit")
    public String saveEditedToDo(@RequestParam String newtodo, @RequestParam boolean urgent,
                                 @RequestParam boolean done, @PathVariable Long idOfTodo, @RequestParam String description,  Model model) {
        if (newtodo == "") {
            newtodo = this.todoRepository.getById(idOfTodo).getTitle();
        }
        Todo toDo = new Todo(idOfTodo,newtodo,urgent,done,description);
        this.todoRepository.save(toDo);
        return "redirect:/list";
    }

    @PostMapping ("/search")
    public String search (@RequestParam String search, Model model) {
        model.addAttribute("todos", this.todoRepository.findSearch(search));
        return "todolist";
    }

}

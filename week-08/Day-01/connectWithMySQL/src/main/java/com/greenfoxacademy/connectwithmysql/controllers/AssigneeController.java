package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectwithmysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AssigneeController {

    public AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/list-assignees")
    public String listAssignees(Model model) {
        List<Assignee> list = new ArrayList<>();
        this.assigneeService.findAll().forEach(list::add);
        model.addAttribute("assignees", list);
        return "assigneelist";
    }

    @GetMapping("/add-assignee")
    public String addAssignee() {
        return "addAssignee";
    }

    @PostMapping("/add-assignee")
    public String saveAddAssignee(@RequestParam String name, @RequestParam String email, Model model) {
        if (this.assigneeService.checkAssigneeExists(name, email)) {
            model.addAttribute("exists", "Assignee with this e-mail already exists. Please set different e-mail or name");
            return "addAssignee";
        } else if (email == null) {
            email = "";
        }
        this.assigneeService.addAssignee(name, email);
        return "redirect:/list-assignees";
    }

    @GetMapping("/{assigneeId}/deleteAssignee")
    public String deleteAssignee(@PathVariable Long assigneeId) {
        this.assigneeService.deleteAssigneeById(assigneeId);
        return "redirect:/list-assignees";
    }

    @GetMapping("/{assigneeId}/editAssignee")
    public String editAssignee(Model model, @PathVariable Long assigneeId) {
        model.addAttribute("id", assigneeId);
        model.addAttribute("assigneeName", this.assigneeService.getById(assigneeId).getName());
        model.addAttribute("assigneeEmail", this.assigneeService.getById(assigneeId).getEmail());
        return "editAssignee";
    }

    @PostMapping("/{assigneeId}/editAssignee")
    public String editAssignee(@RequestParam String name, @RequestParam String emailAssignee, @PathVariable Long assigneeId, Model model) {
        if (this.assigneeService.checkAssigneeExists(name, emailAssignee)) {
            model.addAttribute("exists", "Assignee with this e-mail already exists. Please set different e-mail or name");
            model.addAttribute("id", assigneeId);
            model.addAttribute("assigneeName", this.assigneeService.getById(assigneeId).getName());
            model.addAttribute("assigneeEmail", this.assigneeService.getById(assigneeId).getEmail());
            return "/editAssignee";
        }
        this.assigneeService.editAssignee(assigneeId, name, emailAssignee);
        return "redirect:/list-assignees";
    }

    @PostMapping("/searchAssignee")
    public String searchInAssignee(@RequestParam String search, Model model) {
        model.addAttribute("assignees", this.assigneeService.findInAssignne(search));
        return "assigneelist";
    }

}

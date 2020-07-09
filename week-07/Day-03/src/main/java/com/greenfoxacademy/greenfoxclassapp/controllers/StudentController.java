package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.models.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @GetMapping ("/gfa")
    public String mainPage (Model model) {
        model.addAttribute("count", studentservice.count());
        return "index";
    }

    @GetMapping ("/gfa/list")
    public String listALL (Model model) {
        model.addAttribute("all", this.studentservice.findAll());
        return "listall";
    }

    @GetMapping ("/gfa/add")
    public String addStudent () {
        return "addstudent";
    }

    @PostMapping ("/gfa/save")
    public String savedStudent (Model model, @RequestParam String nameStudent) {
        model.addAttribute("saved", nameStudent);
        model.addAttribute("count", studentservice.count());
        this.studentservice.save(nameStudent);
        return "saved";
    }

    @GetMapping ("/gfa/check")
    public String checkStudent () {
        return "check";
    }

    @PostMapping ("/gfa/checked")
    public String checkStudent (@RequestParam String text, Model model) {
        model.addAttribute("result",studentservice.checkStudent(text));
        return "checked";
    }

}

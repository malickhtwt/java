package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

@GetMapping("/hello")
public String hello(Model theModel) {
    Student theStudent = new Student();
    theModel.addAttribute("student", theStudent);
    return "hello";
}

}

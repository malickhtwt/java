package com.example.demo.rest;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class FunRestController {
    List<Student> students = new ArrayList<>();
    public FunRestController() {

        students.add(new Student("John", "Smith"));
        students.add(new Student("Foo", "Bar"));
    }

    @GetMapping("/students")
    public List<Student> helloWorld() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student studentId(@PathVariable int studentId) {
        Student fetchStudent = students.get(studentId);
        return fetchStudent;
    }

//    private Coach myCoach;
////    private Coach anotherCoach;
//    @Autowired
//    public  FunRestController(@Qualifier("aquatic") Coach myCoach) {
////        System.out.println("Constructor:" + getClass().getSimpleName());
//        this.myCoach = myCoach;
//    }

//    @Autowired
//    public  FunRestController(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

//    @Autowired
//    public void setCoach(Coach coach) {
//        myCoach = coach;
//    }

//    @GetMapping("/")
//    public String getWorkout() {
//        return this.myCoach.runDailyWorkout();
////        return "Comparing Beans: " + (myCoach.equals(anotherCoach));
//    }



//    @Value("${messaging.tool}")
//    private String messagingName;
//
//    @Value("${language.name}")
//    private String languageName;
//
//    @GetMapping("/")
//    public String sayHello() {
//        return "<h1>Hello World</h1>";
//    }
//
//    // Endpoint that returns our custom properties
//    @GetMapping("/custom-properties")
//    public String getProperty() {
//        return "Favorite Messaging Product: " + messagingName + ", Favorite Language: "
//                + languageName;
//    }
}

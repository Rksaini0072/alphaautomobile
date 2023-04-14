package com.alphaautomobile.api;


import com.alphaautomobile.Entity.Student;
import com.alphaautomobile.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AutomobileServiceController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/Hello")
    public  String Hello() {
        return "welcome";

    }
    @GetMapping("/studentList")
            public List<Student> students(){

        return  studentRepository.findAll();
    }

    @PostMapping("/addstudent")
    public String addstudent(@RequestBody Student std){
        System.out.println(std.toString());
          studentRepository.save(std);
          return "student added successfully";
    }

}

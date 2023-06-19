package com.damilola.blogbackendapi.controller;

import com.damilola.blogbackendapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("student")
    public Student getStudent(){
         Student student = new Student(1,  "damilila", "oyeyipo");

         return student;
    }


    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,  "damilila", "oyeyipo"));
        students.add(new Student(2,  "damilwila", "oyeyipeo"));

        return students;
    }

    @GetMapping("students/{id}")
    public Student oneStudent (@PathVariable int id) {
        return new Student(id, "Gbemi", "Oye");
    }

    
}

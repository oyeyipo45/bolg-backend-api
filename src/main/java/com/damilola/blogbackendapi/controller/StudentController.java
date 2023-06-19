package com.damilola.blogbackendapi.controller;

import com.damilola.blogbackendapi.bean.Student;
import org.springframework.web.bind.annotation.*;

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
    public Student oneStudent (@PathVariable("id") int studentId) {
        return new Student(studentId, "Gbemi", "Oye");
    }

    @GetMapping("students/query")
    public Student studentRequest (@RequestParam int id,
                                   @RequestParam String name) {
        return new Student(id, name, "Oye");
    }
    @PostMapping("students")
    public Student createStudent (@RequestBody Student student) {
            return student;
    }

    @PutMapping("students/{id}")
    public Student updateStudent (@RequestBody Student student,
                                  @PathVariable int id) {

        Student firstStudent = new Student(1, "Dami",  "oye");
        firstStudent.setFirstName("damilola");
        firstStudent.setId(3);
        return firstStudent;
    }

    @DeleteMapping("students/{id}")
    public String updateStudent (@PathVariable int id) {

        return "Student deleted";
    }
}

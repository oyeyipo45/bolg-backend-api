package com.damilola.blogbackendapi.controller;

import com.damilola.blogbackendapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
         Student student = new Student(1,  "damilila", "oyeyipo");

        return new ResponseEntity<>(student, HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,  "damilila", "oyeyipo"));
        students.add(new Student(2,  "damilwila", "oyeyipeo"));

       return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> oneStudent (@PathVariable("id") int studentId) {
        Student student = new Student(studentId, "Gbemi", "Oye");
        return new ResponseEntity<>(student,  HttpStatus.OK);
    }

    @GetMapping("query")
    public ResponseEntity<Student> studentRequest (@RequestParam int id,
                                   @RequestParam String name) {
        Student student = new Student(id, name, "Oye");
        return new ResponseEntity<>(student,  HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Student> createStudent (@RequestBody Student student) {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent (@RequestBody Student student,
                                  @PathVariable int id) {

        Student firstStudent = new Student(1, "Dami",  "oye");
        firstStudent.setFirstName("damilola");
        firstStudent.setId(id);

        return new ResponseEntity<>(firstStudent, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> updateStudent (@PathVariable int id) {
        return new ResponseEntity<>("Student deleted", HttpStatus.OK);
    }
}

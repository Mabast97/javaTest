package com.example.mydbtesting.controller;

import com.example.mydbtesting.model.Student;
import com.example.mydbtesting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/testing/student")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/testing/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }


    @GetMapping("testing/student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return new Student();
    }

//    @PutMapping("/testing/student/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
//
//    }



}

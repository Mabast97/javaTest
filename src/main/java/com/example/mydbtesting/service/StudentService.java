package com.example.mydbtesting.service;

import com.example.mydbtesting.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getStudents() ;

    Student saveStudent(Student student);

    Student findById(Long id);

    Student hi(int h);

}

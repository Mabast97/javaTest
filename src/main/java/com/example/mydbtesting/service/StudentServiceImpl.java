package com.example.mydbtesting.service;

import com.example.mydbtesting.model.Student;
import com.example.mydbtesting.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent())
            return student.get();
        throw new RuntimeException("This is not found for the Id : "+id);
    }

    @Override
    public Student hi(int h) {
        return null;
    }


}

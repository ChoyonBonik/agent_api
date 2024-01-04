package com.example.testapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testapi.entity.Student;
import com.example.testapi.repository.StudentRepository;

@Service
public class StudentService {

	
	private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
}

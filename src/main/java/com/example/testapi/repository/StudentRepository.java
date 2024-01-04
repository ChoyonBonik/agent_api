package com.example.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

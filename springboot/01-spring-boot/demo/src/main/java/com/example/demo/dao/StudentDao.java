package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    Student findId(Integer id);

    List<Student> findAll();
}

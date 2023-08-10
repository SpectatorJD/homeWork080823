package com.example.homeWork080823.service;

import com.example.homeWork080823.model.Student;

public interface StudentService {
    Student addStudent (Student student);
    Student findStudent (long id);
    Student editStudent (long id, Student student);
    void deleteStudent (long id);

}
package com.example.homeWork080823.repository;

import com.example.homeWork080823.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {
}

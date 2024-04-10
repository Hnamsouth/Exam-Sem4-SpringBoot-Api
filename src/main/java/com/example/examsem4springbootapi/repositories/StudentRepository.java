package com.example.examsem4springbootapi.repositories;

import com.example.examsem4springbootapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    boolean existsByCode(String code);
}

package com.example.examsem4springbootapi.repositories;

import com.example.examsem4springbootapi.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    boolean existsByCodeOrName(String code, String name);
}

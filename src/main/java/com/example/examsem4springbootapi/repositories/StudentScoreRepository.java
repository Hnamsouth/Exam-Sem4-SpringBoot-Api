package com.example.examsem4springbootapi.repositories;

import com.example.examsem4springbootapi.entities.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {
    Optional<StudentScore> findByStudent_Id(Long studentId);
}

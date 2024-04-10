package com.example.examsem4springbootapi.entities.response;

import com.example.examsem4springbootapi.entities.Student;
import com.example.examsem4springbootapi.entities.Subject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentResponse {
    private Long id;
    private Double score1;
    private Double score2;
    private Student student;
    private Subject subject;
    private String grade;




}

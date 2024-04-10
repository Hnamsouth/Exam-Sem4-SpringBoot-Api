package com.example.examsem4springbootapi.controller;


import com.example.examsem4springbootapi.entities.request.CreateStudent;
import com.example.examsem4springbootapi.entities.request.CreateStudentScore;
import com.example.examsem4springbootapi.entities.request.CreateSubject;
import com.example.examsem4springbootapi.service.impl.StudentServiceImpl;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping
    public ResponseEntity<?> getStudentInfo(@NotNull Long id){
        return studentService.getStudentInfo(id);
    }
    // create student api
    @PostMapping("/create-student")
    public ResponseEntity<?> createStudent(@Valid CreateStudent data){
        return studentService.createStudent(data);
    }
    // create subject api
    @PostMapping("/create-subject")
    public ResponseEntity<?> createSubject(@Valid CreateSubject data){
        return studentService.createSubject(data);
    }
    // create student score api
    @PostMapping("/create-student-score")
    public ResponseEntity<?> createStudentScore(@Valid CreateStudentScore data){
        return studentService.createStudentScore(data);
    }
}

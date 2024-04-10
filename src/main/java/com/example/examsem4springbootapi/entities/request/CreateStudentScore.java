package com.example.examsem4springbootapi.entities.request;


import com.example.examsem4springbootapi.entities.Subject;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateStudentScore {
    @NotNull
    @Min(value = 0,message = "Score1 must be greater than 0")
    @Max(value = 10,message = "Score1 must be less than 10")
    private Double score1;

    @NotNull
    @Min(value = 0,message = "Score1 must be greater than 0")
    @Max(value = 10,message = "Score1 must be less than 10")
    private Double score2;

    @NotNull
    @Min(value = 1,message = "Student id must be greater than 0")
    private Long studentId;

    @NotNull
    @Min(value = 1,message = "Student id must be greater than 0")
    private Long subjectId;
}

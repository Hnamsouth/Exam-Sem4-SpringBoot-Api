package com.example.examsem4springbootapi.entities.request;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateSubject {
    @NotBlank(message = "Subject Code is required")
    @Size(min = 3,max = 20,message = "Subject Code must be between 3 and 20 characters")
    private String code;
    @NotBlank(message = "Subject name is required")
    @Size(min = 3,max = 100,message = "Subject name must be between 3 and 100 characters")
    private String name;

    @NotNull(message = "Subject Credit is required")
    @Min(value = 1,message = "Subject Credit must be greater than 0")
    private int credit;
}

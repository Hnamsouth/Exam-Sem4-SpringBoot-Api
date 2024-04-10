package com.example.examsem4springbootapi.entities.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateStudent {
    @NotBlank(message = "Student Code is required")
    @Size(min = 3,max = 20,message = "Student Code must be between 3 and 20 characters")
    private String code;
    @NotBlank(message = "Student Full name is required")
    @Size(min = 3,max = 100,message = "Student Full name must be between 3 and 100 characters")
    private String fullName;

    @Size(min = 3,max = 255,message = "Student Address must be between 3 and 255 characters")
    private String address;
}

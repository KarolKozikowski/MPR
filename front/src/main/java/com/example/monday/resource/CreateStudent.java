package com.example.monday.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudent {
    @NotBlank
    private String name;

    @NotNull
    private StudentUnit unit;

    @NotNull
    private Semester semester;

    @NotNull
    private  Long czesne;
}

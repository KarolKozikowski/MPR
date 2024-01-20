package com.example.monday.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    public Student(String name, StudentUnit unit, Semester semester, Long czesne) {
        this.name = name;
        this.unit = unit;
        this.semester = semester;
        this.czesne = czesne;
    }
    public Student(String name, StudentUnit unit, Semester semester, Long czesne, Long index, UUID id) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.semester = semester;
        this.czesne = czesne;
        this.index = index;
    }

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Long czesne;
    @Enumerated(EnumType.STRING)
    private StudentUnit unit;
    @Enumerated(EnumType.STRING)
    private Semester semester;
    @Setter
    private Long index;

}

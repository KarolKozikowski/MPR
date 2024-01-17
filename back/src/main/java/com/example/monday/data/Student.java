package com.example.monday.data;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    public Student(String name, StudentUnit unit, Semester semester, float czesne) {
        this.name = name;
        this.unit = unit;
        this.semester = semester;
        this.czesne = czesne;
    }
    public Student(String name, StudentUnit unit, Semester semester, float czesne, Long index) {
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
    private float czesne;
    @Enumerated(EnumType.STRING)
    private StudentUnit unit;
    @Enumerated(EnumType.STRING)
    private Semester semester;
    @Setter
    private Long index;

}

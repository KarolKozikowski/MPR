package com.example.monday.data;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    public Student(String name, StudentUnit unit, Semester semester) {
        this.name = name;
        this.unit = unit;
        this.semester = semester;
    }
    public Student(String name, StudentUnit unit, Semester semester, Long index) {
        this.name = name;
        this.unit = unit;
        this.semester = semester;
        this.index = index;
    }

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @Enumerated(EnumType.STRING)
    private StudentUnit unit;
    @Enumerated(EnumType.STRING)
    private Semester semester;
    @Setter
    private Long index;

}

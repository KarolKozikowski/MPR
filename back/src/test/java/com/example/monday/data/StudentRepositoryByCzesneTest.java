package com.example.monday.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class StudentRepositoryByCzesneTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        var student1 = new Student("Karol", StudentUnit.GDANSK, Semester.III, 1870L, 10L);
        var student2 = new Student("Aga", StudentUnit.WARSZAWA, Semester.I, 2250L, 25L);
        studentRepository.save(student1);
        studentRepository.save(student2);
    }
    @Test
    void givenStudents_whenSortByCzesne_thenGetRightStudent() {
        var studentOne = studentRepository.getStudentsByCzesne(1870L);
        assertEquals(studentRepository.getStudentsBySemester(Semester.III), studentOne);
    }
    @Test
    void givenStudents_whenSortBySemester_thenGetRightStudent() {
        var studentOne = studentRepository.getStudentsBySemester(Semester.III);
        assertEquals(studentRepository.getStudentsByCzesne(1870L), studentOne);
    }
}

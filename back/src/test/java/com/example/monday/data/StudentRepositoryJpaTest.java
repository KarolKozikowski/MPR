package com.example.monday.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class StudentRepositoryJpaTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        var student1 = new Student("Karol", StudentUnit.GDANSK, Semester.III, 1870L, 10L);
        var student2 = new Student("Aga", StudentUnit.WARSZAWA, Semester.I ,2250L, 25L);
        studentRepository.save(student1);
        studentRepository.save(student2);
    }

    @Test
    void givenStudents_whenGetMaxIndex_ThenReturnValidResult() {
        var maxIndex = studentRepository.getMaxIndex();
        assertTrue(maxIndex.isPresent());
        assertEquals(25L, maxIndex.get());
    }


}
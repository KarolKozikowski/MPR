package com.example.monday.service;
import com.example.monday.data.*;
import com.example.monday.resource.CreateStudent;
import com.example.monday.resource.StudentMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentUpdateTest {

    private StudentRepository studentRepository = mock(StudentRepository.class);

    private StudentMapper studentMapper = new StudentMapper();

    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService(studentRepository, studentMapper);
    }


    @Test
    void givenIIISemester_WhenSaveStudent_ThenGetValidIndex() {

        var student = new CreateStudent("Karol", StudentUnit.GDANSK, Semester.III, 1870L);

        studentService.saveStudent(student);
        var karol = studentRepository.getAllByName("Karol");
        for(Student student1 : karol){
            student1.setSemester(Semester.IV); // ZDAŁEM :3
            studentService.updateStudent(studentMapper.toDto(student1));
        }
        for(Student student2 : studentRepository.getAllByName("Karol")){
            assertEquals(Semester.IV, student2.getSemester());
        }
    }
}

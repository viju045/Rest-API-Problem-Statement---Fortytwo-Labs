package com.example.restapi.service;

import static org.junit.Assert.*;

import com.example.restapi.model.Student;
import com.example.restapi.repository.StudentRepo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Optional;

public class StudentServiceTest {

    @Mock
    private StudentRepo studentRepository;

    private StudentService studentService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        studentService = new StudentService();
    }

    @Test(expected = NullPointerException.class)
    public void testSaveStudent() {
        Student studentToSave = new Student();
        Student savedStudent = new Student();
        Mockito.when(studentRepository.save(studentToSave)).thenReturn(savedStudent);

        Student result = studentService.saveStudent(studentToSave);

        assertEquals(savedStudent, result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetStudentByName() {
        String studentName = "John Doe";
        Student foundStudent = new Student();
        Mockito.when(studentRepository.findByName(studentName)).thenReturn(Optional.of(foundStudent));

        Optional<Student> result = studentService.getStudentByName(studentName);

        assertTrue(result.isPresent());
        assertEquals(foundStudent, result.get());
    }

    @Test(expected = NullPointerException.class)
    public void testGetStudentByNameNotFound() {
        String studentName = "NonExistentStudent";
        Mockito.when(studentRepository.findByName(studentName)).thenReturn(Optional.empty());

        Optional<Student> result = studentService.getStudentByName(studentName);

        assertFalse(result.isPresent());
    }
}

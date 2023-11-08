package com.example.restapi.controller;

import static org.junit.Assert.*;

import com.example.restapi.model.Student;
import com.example.restapi.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;

public class StudentControllerTest {

    @Mock
    private StudentService studentService;

    private StudentController studentController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        studentController = new StudentController();
    }

    @Test(expected = NullPointerException.class)
    public void testSaveStudent() {
        Student studentToSave = new Student();
        Student savedStudent = new Student();
        Mockito.when(studentService.saveStudent(studentToSave)).thenReturn(savedStudent);

        ResponseEntity<Student> response = studentController.saveStudent(studentToSave);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(savedStudent, response.getBody());
    }

    @Test(expected = NullPointerException.class)
    public void testGetStudentData() {
        String studentName = "John Doe";
        Student foundStudent = new Student();
        Mockito.when(studentService.getStudentByName(studentName)).thenReturn(Optional.of(foundStudent));

        ResponseEntity<Student> response = studentController.getStudentData(studentName);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(foundStudent, response.getBody());
    }

    @Test(expected = NullPointerException.class)
    public void testGetStudentDataNotFound() {
        String studentName = "NonExistentStudent";
        Mockito.when(studentService.getStudentByName(studentName)).thenReturn(Optional.empty());

        ResponseEntity<Student> response = studentController.getStudentData(studentName);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }
}

package com.example.restapi.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testIdGetterAndSetter() {
        Long id = 1L;
        student.setId(id);
        assertEquals(id, student.getId());
    }

    @Test
    public void testNameGetterAndSetter() {
        String name = "John Doe";
        student.setName(name);
        assertEquals(name, student.getName());
    }

    @Test
    public void testAgeGetterAndSetter() {
        int age = 20;
        student.setAge(age);
        assertEquals(age, student.getAge());
    }

    @Test
    public void testAddressGetterAndSetter() {
        String address = "123 Main St";
        student.setAddress(address);
        assertEquals(address, student.getAddress());
    }

    @Test
    public void testSubjectsGetterAndSetter() {
        List<Subject> subjects = new ArrayList<>();
        //Subject math = new Subject("Math");
        //subjects.add(math);
        student.setSubjects(subjects);

        assertEquals(subjects, student.getSubjects());
    }
}

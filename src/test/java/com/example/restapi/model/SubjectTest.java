package com.example.restapi.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SubjectTest {

    private Subject subject;

    @Before
    public void setUp() {
        subject = new Subject();
    }

    @Test
    public void testIdGetterAndSetter() {
        Long id = 1L;
        subject.setId(id);
        assertEquals(id, subject.getId());
    }

    @Test
    public void testNameGetterAndSetter() {
        String name = "Math";
        subject.setName(name);
        assertEquals(name, subject.getName());
    }

    @Test
    public void testMarksGetterAndSetter() {
        int marks = 95;
        subject.setMarks(marks);
        assertEquals(marks, subject.getMarks());
    }
}

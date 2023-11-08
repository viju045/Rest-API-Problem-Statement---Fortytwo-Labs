/**
 * Created By VijayKumar Mohite
 * Date : 11/8/2023
 * Time : 11:02 AM
 * Project : RestAPI-Application-For-Student-And-Subject
 **/

package com.example.restapi.controller;

import com.example.restapi.model.Student;
import com.example.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/StudentDetails")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //Here I Use @PostMapping HTTP method for inserting record in the table.
    @PostMapping("/savedata")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    //Here I Use @GetMapping HTTP method for getting record from the table.
    @GetMapping("/getData")
    public ResponseEntity<Student> getStudentData(@RequestParam String studentName) {
        Optional<Student> student = studentService.getStudentByName(studentName);
        return student.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}

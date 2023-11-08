/**
 * Created By VijayKumar Mohite
 * Date : 11/8/2023
 * Time : 11:04 AM
 * Project : RestAPI-Application-For-Student-And-Subject
 **/

package com.example.restapi.service;

import com.example.restapi.model.Student;
import com.example.restapi.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepository;

    //Here I Use saveStudent method for saving the record in the table.
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    //Here I Use getStudentByName method for getting record from the table.
    public Optional<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }
}

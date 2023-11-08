/**
 * Created By VijayKumar Mohite
 * Date : 11/8/2023
 * Time : 11:03 AM
 * Project : RestAPI-Application-For-Student-And-Subject
 **/
package com.example.restapi.repository;

import com.example.restapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    //Here I Use findByName method for finding the record by using name.
    Optional<Student> findByName(String name);
}

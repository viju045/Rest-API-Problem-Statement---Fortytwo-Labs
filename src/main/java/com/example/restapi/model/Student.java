/**
 * Created By VijayKumar Mohite
 * Date : 11/8/2023
 * Time : 11:02 AM
 * Project : RestAPI-Application-For-Student-And-Subject
 **/

package com.example.restapi.model;

import jakarta.persistence.*;

import java.util.List;

// Student model class.
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private int Age;
    private String Address;
    //Here I use @OneToMany mapping.
    @OneToMany(cascade = CascadeType.ALL)
    private List<Subject> subjects;

    // Setter and getter method of all entities.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

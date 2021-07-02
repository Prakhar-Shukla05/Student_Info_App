package com.prakhar.kela.services;

import org.springframework.stereotype.Service;

import com.prakhar.kela.beans.Student;

@Service
public class StudentService {

    public void saveStudent(Student student) {
        System.out.println("save");
    }
}

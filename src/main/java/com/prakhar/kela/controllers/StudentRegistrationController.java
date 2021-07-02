package com.prakhar.kela.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prakhar.kela.beans.Student;
import com.prakhar.kela.beans.StudentRegistrationReply;
import com.prakhar.kela.services.StudentService;

@Controller
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value = "/regsiter/student")
    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registration");
        service.saveStudent(student);
        return null;

    }

    @Autowired
    private StudentService service;

}

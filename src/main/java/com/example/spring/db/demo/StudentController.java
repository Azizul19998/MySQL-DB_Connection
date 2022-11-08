package com.example.spring.db.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    DBManager dbManager;

    @GetMapping("/get_students")
    List<String> getStudents() throws SQLException {
        // get from the db
        return dbManager.getInfo();

    }

    @PostMapping("/create_student")
    public void createStudent(@RequestBody() Student student) throws SQLException {
        //add into the db
        dbManager.insertInfo(student);
    }
}

package com.ua.homework.service;

import com.ua.homework.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Roman", 20, "S001"));
        students.add(new Student("Olexa", 22, "S002"));
        students.add(new Student("Sergey", 19, "S003"));

        return students;
    }
}

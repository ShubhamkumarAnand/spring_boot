package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        101L,
                        "Anjali Sharma",
                        "anjali.sharma@gmail.com",
                        LocalDate.of(2000, 10, 8),
                        21
                )
        );
    }
}

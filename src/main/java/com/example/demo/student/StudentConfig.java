package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student anjali = new Student(
                    "Anjali Sharma",
                    "anjali.sharma@gmail.com",
                    LocalDate.of(2000, JANUARY, 8),
                    21

            );
            Student mohita = new Student(
                    "Mohita Bharadwaj",
                    "mohita@gmail.com",
                    LocalDate.of(2002, FEBRUARY, 18),
                    21
            );
            repository.saveAll(
                    List.of(anjali, mohita)
            );
        };
    }
}

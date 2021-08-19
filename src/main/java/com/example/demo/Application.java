package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.Param;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Saten = new Student(
                    "Saten",
                    "Hovakimyan",
                    "saten.hovakimyan5@gmail.com",
                    21
            );
            studentRepository.save(Saten);
            studentRepository.save(new Student(
                    "Vlad",
                    "Abramyan",
                    "vlad.abramyan5@gmail.com",
                    21
            ));


        };
    }
}

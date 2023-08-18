package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.Entity.Student;
import com.example.studentmanagementsystem.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication{

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }


//    @Autowired
//    private StudentRepo studentRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Student student1 = new Student("Yash","Mittal","yash@gmail.com");
//        studentRepo.save(student1);
//
//        Student student2 = new Student("Chirag","Mittal","chirag@gmail.com");
//        studentRepo.save(student2);
//
//        Student student3 = new Student("Nipurn","Mittal","nipurn@gmail.com");
//        studentRepo.save(student3);
//    }
}

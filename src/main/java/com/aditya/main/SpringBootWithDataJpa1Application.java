package com.aditya.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aditya.main.entities.Student;
import com.aditya.main.services.StudentService;
import com.aditya.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootWithDataJpa1Application.class, args);

		StudentService stdService = context.getBean(StudentServiceImpl.class);

		Student std = new Student();
		std.setName("Ramu");
		std.setMarks(100.0f);
		std.setRollno(1);

		boolean status = stdService.addStudentDetails(std);
		if (status) {
			System.out.println("Student Inserted Successfully");
		} else {
			System.out.println("Can't insert Student due to some reasion");
		}

	}

}

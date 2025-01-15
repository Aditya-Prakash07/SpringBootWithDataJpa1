package com.aditya.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aditya.main.services.StudentService;
import com.aditya.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootWithDataJpa1Application.class, args);

		StudentService stdService = context.getBean(StudentServiceImpl.class);

		// -------------------------Insert Operations--------------------------------

//		Student std = new Student();
//		std.setName("shayam");
//		std.setMarks(99.0f);
//		std.setRollno(2);
//
//		boolean status = stdService.addStudentDetails(std);
//		if (status) {
//			System.out.println("Student Inserted Successfully");
//		} else {
//			System.out.println("Can't insert Student due to some reasion");
//		}

//		 -------------------------Select Operations 1.--------------------------------

//		List<Student> stdList = stdService.getAllStdDetails();
//		for (Student std : stdList) {
//			System.out.println("Student ID : " + std.getId());
//			System.out.println("Student Roll no. : " + std.getRollno());
//			System.out.println("Student Marks : " + std.getMarks());
//			System.out.println("Student Name : " + std.getName());
//
//			System.out.println("___________________________________________________________________________");
//		}
//		

//		 -------------------------Select Operations 2.--------------------------------

//		Student std = stdService.getStdDetails(3l);
//		if (!(std == null)) {
//			System.out.println("Student ID : " + std.getId());
//			System.out.println("Student Roll no. : " + std.getRollno());
//			System.out.println("Student Marks : " + std.getMarks());
//			System.out.println("Student Name : " + std.getName());
//		} else {
//			System.out.println("Student not fond.......!");
//		}

//		--------------------------Update Operation--------------------------------------
//		boolean status = stdService.updateStdDetails(1l, 88.0f);
//		if (status) {
//			System.out.println("Student details updated Successfully.......!");
//		} else {
//			System.out.println("Can't update student details due to some ERROR");
//		}

//		---------------------------Delete Operation-------------------------------------
		boolean status = stdService.deleteStdDetails(2l);
		if (status) {
			System.out.println(
					"__________________________________________________________________________________________");
			System.out.println("Student Details Deleted Successfully.......!");
		} else {
			System.out.println("Unable to Delete Student Details Due to some Error");
		}

	}

}

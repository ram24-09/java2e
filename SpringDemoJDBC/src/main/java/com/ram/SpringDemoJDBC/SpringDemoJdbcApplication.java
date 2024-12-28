package com.ram.SpringDemoJDBC;

import com.ram.SpringDemoJDBC.model.Student;

import com.ram.SpringDemoJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDemoJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoJdbcApplication.class, args);

		//creating object of Student class.
		Student s = context.getBean(Student.class);

		//setting up values for student table to insert
		s.setRollNo(105);
		s.setName("Payal");
		s.setMarks(99);

		//creating object of StudentService class to access its method's
		StudentService service = context.getBean(StudentService.class);

		//calling addStudent method from StudentService class.
		service.addStudent(s);

		//calling getStudents method from StudentService class.
		List<Student> students = service.getStudents();
		System.out.println(students);//printing list of students
	}

}

package com.ram.SpringBootDemo;

import com.ram.SpringBootDemo.model.Laptop;
import com.ram.SpringBootDemo.model.Student;
import com.ram.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
//		Student s = context.getBean(Student.class);
//		s.code();
	}
}

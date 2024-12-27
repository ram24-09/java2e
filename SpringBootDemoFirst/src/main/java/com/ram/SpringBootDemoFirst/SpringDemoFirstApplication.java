package com.ram.SpringBootDemoFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoFirstApplication.class, args);
		Student s = context.getBean(Student.class);
		s.code();
	}
}

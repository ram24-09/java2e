package com.ram.springDataJPA;

import com.ram.springDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
	}
}

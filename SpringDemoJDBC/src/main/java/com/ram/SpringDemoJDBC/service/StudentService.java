package com.ram.SpringDemoJDBC.service;

import com.ram.SpringDemoJDBC.model.Student;
import com.ram.SpringDemoJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    //Calling save method from StudentRepo class
    public void addStudent(Student s){
       repo.save(s);
   };

    //Calling findAll method from StudentRepo class
    public List<Student> getStudents() {
        return repo.findAll();
    }
}

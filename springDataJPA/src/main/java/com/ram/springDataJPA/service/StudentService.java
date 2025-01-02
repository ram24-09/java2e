package com.ram.springDataJPA.service;

import com.ram.springDataJPA.model.Student;
import com.ram.springDataJPA.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student getStudentByRollNo(int rollNo){
        return repo.findById(rollNo).orElse(new Student());
    }

    public Student addStudent(Student s){
        return repo.save(s);
    }

    public Student updateStudentByRollNo(int rollNo, int marks) {
            Student s =repo.findById(rollNo).get();
            s.setMarks(marks);
            return repo.save(s);
    }

    public void deleteStudentByRollNo(int rollNo){
       repo.deleteById(rollNo);
    }
}

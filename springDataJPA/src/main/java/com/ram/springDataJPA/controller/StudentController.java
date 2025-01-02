package com.ram.springDataJPA.controller;

import com.ram.springDataJPA.model.Student;
import com.ram.springDataJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/students/{rollNo}")
    public Student getStudentByRollNo(@PathVariable("rollNo") int rollNo){
        return service.getStudentByRollNo(rollNo);
    }

    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student s) {
       return service.addStudent(s);
    }

    @PutMapping("/students/update/{rollNo}/marks")
    public Student updateMarks(@PathVariable("rollNo") int rollNo, @RequestParam int marks) {
        return service.updateStudentByRollNo(rollNo, marks);
    }

    @DeleteMapping("/students/delete/{rollNo}")
    public void deleteStudentByRollNo(@PathVariable("rollNo") int rollNo){
        service.deleteStudentByRollNo(rollNo);
    }
}

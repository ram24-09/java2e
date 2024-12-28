package com.ram.SpringDemoJDBC.repo;

import com.ram.SpringDemoJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    //Method to insert data in database
    public void save(Student s) {
//        String query1 = "insert into student (rollNo, name, marks) values (?,?,?)";
//        int rows = jdbc.update(query1, s.getRollNo(), s.getName(), s.getMarks());//jdbc.update will insert data
//        System.out.println("number of rows inserted : "+rows);
    }

    //Method to fetch list of students from database
    public List<Student> findAll() {
        String query2  = "select * from student";
//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setRollNo(rs.getInt("rollNo"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//            }
//        };

        //using lambda expression
    return jdbc.query(query2, (rs, rowNum) -> {//jdbc.query will fetch data
        Student s = new Student();
        s.setRollNo(rs.getInt("rollNo"));
        s.setName(rs.getString("name"));
        s.setMarks(rs.getInt("marks"));
        return s;
    });
    }
}
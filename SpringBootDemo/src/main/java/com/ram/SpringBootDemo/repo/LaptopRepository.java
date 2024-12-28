package com.ram.SpringBootDemo.repo;

import com.ram.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("save method called...");
    }
}

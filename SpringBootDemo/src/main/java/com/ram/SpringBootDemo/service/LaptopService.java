package com.ram.SpringBootDemo.service;

import com.ram.SpringBootDemo.repo.LaptopRepository;
import com.ram.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }
}

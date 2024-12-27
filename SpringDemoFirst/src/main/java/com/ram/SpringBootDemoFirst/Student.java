package com.ram.SpringBootDemoFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired//we are wiring the laptop class here to access it in main method using this Student class.
    Laptop laptop;
    public void code(){
        System.out.println("coding...");
        laptop.compile();
    }
}

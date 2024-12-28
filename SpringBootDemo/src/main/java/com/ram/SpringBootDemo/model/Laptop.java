package com.ram.SpringBootDemo.model;

import org.springframework.stereotype.Component;

@Component("Laptop")
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling in laptop...");
    }
}

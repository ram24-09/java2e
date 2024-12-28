package com.ram.SpringBootDemo.model;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

    @Component("Desktop")
    @Primary
    public class Desktop implements Computer {
        public void compile(){
            System.out.println("Compiling in desktop...");
        }
    }


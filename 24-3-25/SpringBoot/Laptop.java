package com.project.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Laptop is compliling...");
    }
    public void debug(){
        System.out.println("Laptop is debugging...");
    }
}

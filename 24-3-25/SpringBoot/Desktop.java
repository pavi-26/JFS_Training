package com.project.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Desktop {
    public void compile(){
        System.out.println("Desktop is compliling...");
    }
    public void debug(){
        System.out.println("Desktop is debugging...");
    }
}

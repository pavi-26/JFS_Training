package com.project.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
   // Desktop desktop=new Desktop();
   //Laptop laptop=new Laptop();

    @Autowired
    Laptop laptop;

    //@Autowired
    //Desktop desktop;

    public void sayHello(){

        System.out.println("hello developer!!");
    }

    public void task(){
       // desktop.compile();
        //desktop.debug();

        //laptop.compile();
        laptop.debug();
        System.out.println("the task is completed!!");
    }
}

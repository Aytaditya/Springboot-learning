package com.aditya.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private Work work; // to run checkLogs function we need object of Work class and we cant create a new object
    //  we need to map the existing created object inside ioc container to this which is done using Autowired Annotation
    public void build(){
        work.checkLogs();
        System.out.println("Building stuff");
    }
}

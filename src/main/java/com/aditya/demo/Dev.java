package com.aditya.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired  // field injection (field injection is not preffered)
    private Work work; // to run checkLogs function we need object of Work class and we cant create a new object
    //  we need to map the existing created object inside ioc container to this which is done using Autowired Annotation

    // can also be done by constructor injection (autowiring is optional for constructor injection but mandatory for field & setter)
    //    public Dev(Work work){
    //        this.work=work;
    //    }

    // can also be done by setter injection
//    @Autowired
//    public void setLaptop(Work work){
//        this.work=work;
//    }

    public void build(){
        work.checkLogs();
        System.out.println("Building stuff");
    }
}

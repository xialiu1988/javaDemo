package com.LLiu.java401d4.CF.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //specify the route for this method
    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello,World";
    }

    @GetMapping("/hello/{name}/{from}")
    public String getHelloToMe(@PathVariable String name,@PathVariable int from){
        return "Hello, "+name +" from "+(from*20);
    }
}

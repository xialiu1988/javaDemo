package com.LLiu.java401d4.CF.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//not rest controller
//Thymeleaf,our view engine will try to handle what we return from these methods
//Thymeleaf expects the string we return to be the name of a template

@Controller
public class NotARestController {

    @GetMapping("/notresthello")
    public String getNotResthello(Model m){
        //this means that Thymeleaf should render a template named "hello"
        String[] names = new String[]{"aa","cat","dog"};
        m.addAttribute("names",names);
        return "hello";
    }
}

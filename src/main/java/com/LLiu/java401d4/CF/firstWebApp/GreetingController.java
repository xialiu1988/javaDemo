package com.LLiu.java401d4.CF.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @Autowired
    GreetingRepository greetingRepository;

    @GetMapping("/greetings")
    public String getAllgreetings(Model m){
   Iterable<Greeting> greetings = greetingRepository.findAll();
   m.addAttribute("greetings",greetings);
   return "allGreetings";
    }
}

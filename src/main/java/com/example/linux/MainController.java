package com.example.linux;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String greet(){
        System.out.println("greet()");
        return "Greetings from Server!";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        return "Greetings from hello!";
    }

}

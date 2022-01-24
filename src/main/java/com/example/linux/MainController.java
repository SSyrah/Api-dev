package com.example.linux;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String greet(){
        System.out.println("greet()");
        return "Greetings from Server!";
    }
    // http://localhost:8080/hello
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        return "Greetings from hello!";
    }

    // http://localhost:8080/helloname?name=Juhis
    @GetMapping("/helloname")
    @ResponseBody
    public String SayHello(@RequestParam String name){
        System.out.println("helloname");
        return "Greetings  " + name +"!";
    }


    @GetMapping("/manyparams")
    @ResponseBody
    public String manyparams(@RequestParam String name, int age){
        System.out.println(name + " "+age+" ");
        return "Your name: " + name +"   " + "Your age is: " + age;
    }
    @GetMapping("/name/{name}")
    @ResponseBody
    public String HelloName(@PathVariable String name){
        System.out.println("Helloname");
        return "Welcome to this website " + name;
    }

}

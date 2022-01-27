package com.example.linux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MainController {

    @Autowired
    private MonsterService monsterService;
    @Autowired
    private ListMapService listMapService;

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
        return "Welcome to this website and your name is: " + name;
    }

    @GetMapping("/list")
    @ResponseBody
    public ArrayList<String> getlist(){
        System.out.println("Returning list...");
       return ListMapService.getList();
    }

    @GetMapping("/map")
    @ResponseBody
    public HashMap<String, String> getMap(){
        System.out.println("Returning map...");
        return ListMapService.getMap();

    }

    @GetMapping("/monster")
    @ResponseBody
    public Monster getMonster(){
        System.out.println("Returning monster..");
        Monster monster = monsterService.getNewMonster();
        return monster;
    }

    @PostMapping("/monster")
    @ResponseBody
    public Monster createMonster(@RequestBody Monster m){
        System.out.println("Thank you for this Monster:");
        System.out.println("Name: " + m.getmName() + "  Age: " +m.getmAge());
        if (m.ismScary()){
            System.out.println("Ah, your monster is Scary, ups!");
        }
        else{
            System.out.println("Nice, your monster doesn't scare");
        }
        return m;
    }

}

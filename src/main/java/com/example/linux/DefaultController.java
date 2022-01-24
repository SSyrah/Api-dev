package com.example.linux;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping("*")
    public String redirect(){
        System.out.println("redirecting");
        return "redirect:/hello";
    }

}

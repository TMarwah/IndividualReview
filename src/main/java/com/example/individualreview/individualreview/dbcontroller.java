package com.example.individualreview.individualreview;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dbcontroller {

    @RequestMapping("/")
    public String log(){
        return "Logged in!";
    }
}

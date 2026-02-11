package com.example.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.User;

import java.util.HashMap;
import java.util.Map;

@RestController

// it handles incomming http requests and sends the response
// what you see in response is ultimately what is returned from the controller
// @RequestMapping gives the path for the whole controller

@RequestMapping("/user")
public class Controller {

    @GetMapping("/hello")
    public String ping() {
        return "Spring Boot is Working...!!";
    }

    @GetMapping("/2ndRequest")
    public String adb() {
        return "You are on the abc page";
    }

    @GetMapping("/3rdRequest")
    public String wel() {
        return "You are welcome to our page...! And your program is working well";
    }

    @GetMapping("/jsonFile")
    public Map<String, Object> json() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("message", "Hello World");
        map.put("data", 1);
        map.put("data2", 2);
        map.put("data3", 3);
        return map;
    }

    @GetMapping("/html")
    public String webpage() {
        return "<h1>Dummy Website</h1>";
    }
    @GetMapping("/test")
    User test(){
        User user = new User();
        user.setEmail("test@gmail") ;
        user.setPassword("123456");
        user.setUsername("test") ;


        return user;
    }
}




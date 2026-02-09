package com.example.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController

// it handles incomming http requests and sends the response
// what you see in response is ultimately what is returned from the controller
// @RequestMapping gives the path for the whole controller

@RequestMapping("/user")
public class Controller {

      // path inside the coontroller
    
      @GetMapping("")
    public String ping(){
        return "Pong...!!";
    } 
    @GetMapping("/2ndRequest")
    public String adb(){
        return "Yourr are on the abc page";
    } 
    @GetMapping("/3rdRequest")
    public String wel(){
        return "Yourr are welcome to out page...! And your programme is working wel";
    } 
     @GetMapping("/jsonFile")
    public Map<String, Object> json(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("message", "Hello World");
        map.put("data", 1);
        map.put("data2", 2);
        map.put("data3", 3);
        return map;
    }

    @GetMapping("/html")
    public String webpage(){
        return "<!DOCTYPE html>\r\n" + //
                        "<html lang=\"en\">\r\n" + //
                        "<head>\r\n" + //
                        "    <meta charset=\"UTF-8\">\r\n" + //
                        "    <title>Dummy Website</title>\r\n" + //
                        "\r\n" + //
                        "    <style>\r\n" + //
                        "        body {\r\n" + //
                        "            margin: 0;\r\n" + //
                        "            font-family: Arial, sans-serif;\r\n" + //
                        "            background-color: #f4f4f4;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        header {\r\n" + //
                        "            background-color: #333;\r\n" + //
                        "            color: white;\r\n" + //
                        "            padding: 15px;\r\n" + //
                        "            text-align: center;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        nav {\r\n" + //
                        "            background-color: #555;\r\n" + //
                        "            padding: 10px;\r\n" + //
                        "            text-align: center;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        nav a {\r\n" + //
                        "            color: white;\r\n" + //
                        "            margin: 0 10px;\r\n" + //
                        "            text-decoration: none;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        nav a:hover {\r\n" + //
                        "            text-decoration: underline;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        section {\r\n" + //
                        "            padding: 20px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        .card {\r\n" + //
                        "            background-color: white;\r\n" + //
                        "            padding: 15px;\r\n" + //
                        "            margin: 10px 0;\r\n" + //
                        "            border-radius: 5px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        button {\r\n" + //
                        "            padding: 10px 15px;\r\n" + //
                        "            border: none;\r\n" + //
                        "            background-color: #333;\r\n" + //
                        "            color: white;\r\n" + //
                        "            cursor: pointer;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        button:hover {\r\n" + //
                        "            background-color: #555;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        footer {\r\n" + //
                        "            background-color: #333;\r\n" + //
                        "            color: white;\r\n" + //
                        "            text-align: center;\r\n" + //
                        "            padding: 10px;\r\n" + //
                        "            position: fixed;\r\n" + //
                        "            bottom: 0;\r\n" + //
                        "            width: 100%;\r\n" + //
                        "        }\r\n" + //
                        "    </style>\r\n" + //
                        "</head>\r\n" + //
                        "\r\n" + //
                        "<body>\r\n" + //
                        "\r\n" + //
                        "<header>\r\n" + //
                        "    <h1>Welcome to My Dummy Website😎</h1>\r\n" + //
                        "    <p>Just for practice</p>\r\n" + //
                        "</header>\r\n" + //
                        "\r\n" + //
                        "<nav>\r\n" + //
                        "    <a href=\"#\">Home</a>\r\n" + //
                        "    <a href=\"#\">About</a>\r\n" + //
                        "    <a href=\"#\">Services</a>\r\n" + //
                        "    <a href=\"#\">Contact</a>\r\n" + //
                        "</nav>\r\n" + //
                        "\r\n" + //
                        "<section>\r\n" + //
                        "    <div class=\"card\">\r\n" + //
                        "        <h2>Welcome</h2>\r\n" + //
                        "        <p>This is a dummy website created for learning purposes.</p>\r\n" + //
                        "        <button onclick=\"showMessage()\">Click Me</button>\r\n" + //
                        "    </div>\r\n" + //
                        "\r\n" + //
                        "    <div class=\"card\">\r\n" + //
                        "        <h2>About Us</h2>\r\n" + //
                        "        <p>We provide nothing. This site is only for testing 😄</p>\r\n" + //
                        "    </div>\r\n" + //
                        "</section>\r\n" + //
                        "\r\n" + //
                        "<footer>\r\n" + //
                        "    © 2026 Dummy Website\r\n" + //
                        "</footer>\r\n" + //
                        "\r\n" + //
                        "<script>\r\n" + //
                        "    function showMessage() {\r\n" + //
                        "        alert(\"Button clicked! JavaScript is working.\");\r\n" + //
                        "    }\r\n" + //
                        "</script>\r\n" + //
                        "\r\n" + //
                        "</body>\r\n" + //
                        "</html>\r\n" + //
                        "";
    }

}


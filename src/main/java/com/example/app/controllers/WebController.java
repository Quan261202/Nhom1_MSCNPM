package com.example.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {
   @GetMapping("/homepage")
     public String Homepage() {
         return "homepage";
     }
   @GetMapping("/searching")
     public String Greetings() {
         return "searching";
     }
   @GetMapping("/gioithieu")
     public String Info(){
        return "gioithieu";
     }
   @GetMapping("/quanly")
     public String Manager(){
        return "quanly";
     }
   @GetMapping("/huongdan")
     public String Help(){
        return "huongdan";
     }
   @GetMapping("/nhiemky")
    public String Nhiemky() {
        return "nhiemky";
    }
    @GetMapping("/form")
    public String Form(){
      return "thanhpho/form";
    }
}

package com.example.app.controllers;

import com.example.app.Models.thanhPho;
import com.example.app.Services.thanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {

    @Autowired
    thanhPhoService tpsv;

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
     public String Manager(Model model){
        model.addAttribute("thanhPho", new thanhPho());
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

    @PostMapping("/add-thanh-pho")
    public String addThanhPho(@ModelAttribute thanhPho thanhPho) {
        System.out.println(thanhPho.getTenThanhPho());
        System.out.println(thanhPho.getMaThanhPho());
        tpsv.create(thanhPho);
        return "homepage";
    }
}

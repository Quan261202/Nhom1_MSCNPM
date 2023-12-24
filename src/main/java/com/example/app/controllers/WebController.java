package com.example.app.controllers;


import com.example.app.Models.nhiemKy;
import com.example.app.Models.thanhPho;
import com.example.app.Services.PhieuService;

import com.example.app.Services.thanhPhoService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {

    @Autowired
    thanhPhoService tpsv;
    @Autowired
    PhieuService phieuService;

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
        model.addAttribute("thanhPhos", tpsv.getAlltThanhPhos());
        return "quanly";
     }
   @GetMapping("/huongdan")
     public String Help(){
        return "huongdan";
     }
    @GetMapping("/form")
    public String Form(){
      return "thanhpho/form";
    }

    @GetMapping("/chart")
    public String chart(){
      return "chart";
    }

    @PostMapping("/add-thanh-pho")
    public String addThanhPho(@ModelAttribute thanhPho tp) {
        System.out.println(tp);
        tpsv.create(tp);
        return "redirect:/quanly";
    }

    @PostMapping("/thanhPho/edit/{id}")
    public String updateBook(@PathVariable String id, @ModelAttribute thanhPho thanhPho) {
        thanhPho existingBook = tpsv.findByMaThanhPho(id);
        existingBook.setTenThanhPho(thanhPho.getTenThanhPho());
        return "quanly";
    }

    @GetMapping("/thanhPho/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        tpsv.remove(id);
        return "redirect:/quanly";
    }

    @GetMapping("/thanhPho/{maThanhPho}/nhiemKy")
    public String getAllNhiemKyByMaDonVi(@PathVariable String maThanhPho, Model model){
        model.addAttribute("nhiemKy", new nhiemKy());
        model.addAttribute("nhiemKys", tpsv.findByMaThanhPho(maThanhPho).getNhiemKys());
        return "nhiemky-list";
    }
}

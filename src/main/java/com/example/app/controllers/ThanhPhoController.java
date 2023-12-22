package com.example.app.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Services.thanhPhoService;
import com.example.app.Models.thanhPho;
import com.example.app.Repositories.thanhPhoRepo;

import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping(value="/thanhPho", method = {RequestMethod.GET, RequestMethod.POST}, consumes = {"application/json"}, produces = {" application/json"})

public class ThanhPhoController {
    @Autowired
    thanhPhoService tpsv;
    thanhPhoRepo tprp;
    @GetMapping("")
    public List<thanhPho> getthanhPho() {
        return tpsv.getAlltThanhPhos();
     }
    // @GetMapping("/addForm")
    // public String addTP(Model model) {
    //     model.addAttribute("thanhPho", new thanhPho());
    //     return "/addForm";
    // }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public thanhPho addThanhPho(@RequestBody thanhPho thanhPho){
         return tpsv.create(thanhPho);   
    }
        @RequestMapping(value ="/", method = {RequestMethod.GET, RequestMethod.POST},  produces = "application/json")
    public String home(Model model) {
        model.addAttribute("method", "post");
        model.addAttribute("thanhPho", tprp.findAll());
        return "/thanhPho";
    } 
}

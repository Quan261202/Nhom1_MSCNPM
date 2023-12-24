package com.example.app.controllers;

import com.example.app.Models.nhiemKy;
import com.example.app.Services.NhiemKyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhiemky")
public class NhiemKyController {

    @Autowired
    private NhiemKyService nhiemKyService;

    @GetMapping("/list")
    public String listNhiemKys(Model model) {
        List<nhiemKy> nhiemKys = nhiemKyService.getAllNhiemKys();
        model.addAttribute("nhiemKys", nhiemKys);
        return "nhiemky-list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("nhiemKy", new nhiemKy());
        return "createNhiemKy";
    }

    @PostMapping("/create")
    public String createNhiemKy(@ModelAttribute nhiemKy nhiemKy) {
        nhiemKyService.createNhiemKy(nhiemKy);
        return "redirect:/nhiemky/list";
    }

    @GetMapping("/update/{maNhiemKy}")
    public String showUpdateForm(@PathVariable String maNhiemKy, Model model) {
        nhiemKy existingNhiemKy = nhiemKyService.getNhiemKyById(maNhiemKy);
        model.addAttribute("nhiemKy", existingNhiemKy);
        return "updateNhiemKy";
    }

    @PostMapping("/update/{maNhiemKy}")
    public String updateNhiemKy(@PathVariable String maNhiemKy, @ModelAttribute nhiemKy updatedNhiemKy) {
        nhiemKyService.updateNhiemKy(maNhiemKy, updatedNhiemKy);
        return "redirect:/nhiemky/list";
    }

    // Add more methods as needed
}

package com.example.app.controllers;

import com.example.app.Models.Phieu;
import com.example.app.Services.PhieuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/phieus")
public class PhieuController {

    @Autowired
    private PhieuService phieuService;

    @GetMapping("/list")
    public String listPhieus(Model model) {
        List<Phieu> phieus = phieuService.getAllPhieus();
        model.addAttribute("phieus", phieus);
        return "phieuList";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("phieu", new Phieu());
        return "createPhieu";
    }

    @PostMapping("/create")
    public String createPhieu(Phieu phieu) {
        phieuService.create(phieu);
        return "redirect:/phieus/list";
    }
}

package com.example.app.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.app.Models.daiBieu;
import com.example.app.Repositories.daiBieuRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/data")

@Controller
public class daiBieuController {
    @Autowired
    private daiBieuRepo dp;
    @PostMapping(path="/addDaiBieu")
    public @ResponseBody String addDaiBieu(String maDB, String tenDB, int tongPhieu){
        daiBieu db = new daiBieu(tenDB, tenDB, tongPhieu);
        db.setMaDaiBieu(maDB);
        db.setTenDaiBieu(tenDB);
        db.setTongPhieu(tongPhieu);
        dp.save(db);
        return "addD";
    }
 
    public daiBieuController(daiBieuRepo dp) {
        this.dp = dp;
    }
    
    @GetMapping("/chart-data")
    public List<daiBieu> getChartData() {
        return (List<daiBieu>) dp.findAll(); // Truy vấn dữ liệu từ cơ sở dữ liệu và trả về JSON
    }
   
}


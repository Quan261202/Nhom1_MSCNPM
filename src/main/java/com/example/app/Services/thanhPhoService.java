package com.example.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.app.Models.thanhPho;

@Service
public interface thanhPhoService {
    
    public thanhPho create(thanhPho thanhPho); 
    public List<thanhPho> getAlltThanhPhos();
    
}
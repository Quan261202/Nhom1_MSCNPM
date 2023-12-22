package com.example.app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.Models.thanhPho;
import com.example.app.Repositories.thanhPhoRepo;




@Service
public class thanhPhoIMPL implements thanhPhoService {

    @Autowired
    thanhPhoRepo tp;
    @Override
    public thanhPho create(thanhPho thanhPho) {
        return tp.save(thanhPho);
    }
    @Override
    public  List<thanhPho> getAlltThanhPhos(){
        return (List<thanhPho>) tp.findAll();
    };
}

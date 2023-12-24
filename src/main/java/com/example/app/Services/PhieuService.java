package com.example.app.Services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.Models.Phieu;
@Service
public interface PhieuService {
    public Phieu create(Phieu phieu);

    public List<Phieu> getAllPhieus();
}


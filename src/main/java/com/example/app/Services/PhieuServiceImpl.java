package com.example.app.Services;

import com.example.app.Models.Phieu;
import com.example.app.Repositories.PhieuRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuServiceImpl implements PhieuService {

    @Autowired
    private PhieuRepository phieuRepository;

    @Override
    public Phieu create(Phieu phieu) {
        if (phieu != null) {
            return phieuRepository.save(phieu);
        }
        return null;
    }

    @Override
    public List<Phieu> getAllPhieus() {
        List<Phieu> phieus = new ArrayList<>();
        phieuRepository.findAll().forEach(phieus::add);
        return phieus;
    }
}


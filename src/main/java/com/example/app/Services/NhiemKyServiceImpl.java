package com.example.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.app.Models.nhiemKy;
import com.example.app.Repositories.NhiemKyRepository;

@Service
public class NhiemKyServiceImpl implements NhiemKyService {
     @Autowired
    private NhiemKyRepository nhiemKyRepository;

    @Override
    public nhiemKy createNhiemKy(nhiemKy nhiemKy) {
        return nhiemKyRepository.save(nhiemKy);
    }

    @Override
    public List<nhiemKy> getAllNhiemKys() {
        return (List<nhiemKy>) nhiemKyRepository.findAll();
    }

    @Override
    public nhiemKy getNhiemKyById(String maNhiemKy) {
        Optional<nhiemKy> optionalNhiemKy = nhiemKyRepository.findById(maNhiemKy);
        return optionalNhiemKy.orElse(null);
    }

    @Override
    public void updateNhiemKy(String maNhiemKy, nhiemKy updatedNhiemKy) {
        Optional<nhiemKy> optionalNhiemKy = nhiemKyRepository.findById(maNhiemKy);
        if (optionalNhiemKy.isPresent()) {
            nhiemKy existingNhiemKy = optionalNhiemKy.get();
            existingNhiemKy.setMaNhiemKy(updatedNhiemKy.getMaNhiemKy());
            existingNhiemKy.setTtNhiemKy(updatedNhiemKy.getTtNhiemKy());
            // Update other properties as needed
            nhiemKyRepository.save(existingNhiemKy);
        }
    }
}

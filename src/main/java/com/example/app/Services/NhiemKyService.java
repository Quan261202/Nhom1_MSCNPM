package com.example.app.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.Models.nhiemKy;
@Service
public interface NhiemKyService {

    nhiemKy createNhiemKy(nhiemKy nhiemKy);

    List<nhiemKy> getAllNhiemKys();

    nhiemKy getNhiemKyById(String maNhiemKy);

    void updateNhiemKy(String maNhiemKy, nhiemKy updatedNhiemKy);
}

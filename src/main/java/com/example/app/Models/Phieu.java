package com.example.app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Phieu {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String maPhieu;
  private String maDaiBieu;
  private String maThanhPho;
  private String maUser;
  private String maNhiemKy;
    public Phieu(String maPhieu2, String maDaiBieu2, String maNhiemKy2, String maThanhPho2) {
}

    public String getMaPhieu() {
        return maPhieu;
    }
    public String getMaDaiBieu() {
        return maDaiBieu;
    }
    public String getMaThanhPho() {
        return maThanhPho;
    }
    public String getMaUser() {
        return maUser;
    }
    public String getMaNhiemKy() {
        return maNhiemKy;
    }   
}

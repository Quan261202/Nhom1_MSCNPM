package com.example.app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class daiBieu {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private String maDaiBieu;
    private String tenDaiBieu;
    private int tongPhieu ;

    public daiBieu(String mdb, String tendb, int tongPhieu) {};
    public String getMaDaiBieu() {
        return maDaiBieu;
    }
    public String getTenDaiBieu() {
        return tenDaiBieu;
    }
    public int getTongPhieu() {
        return tongPhieu;
    }
    public void setMaDaiBieu(String maDaiBieu) {
        this.maDaiBieu = maDaiBieu;
    }
    public void setTenDaiBieu(String tenDaiBieu) {
        this.tenDaiBieu = tenDaiBieu;
    }
    public void setTongPhieu(int tongPhieu) {
        this.tongPhieu = tongPhieu;
    }
}

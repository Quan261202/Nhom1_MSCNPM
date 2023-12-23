package com.example.app.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity
public class thanhPho {
    @Id
    private String maThanhPho;

    @Column
    private String tenThanhPho;
    public thanhPho() {
    }
    public thanhPho(String maThanhPho, String tenThanhPho) {
        this.maThanhPho = maThanhPho;
        this.tenThanhPho = tenThanhPho;
    }
    public void setMaThanhPho(String maThanhPho) {
        this.maThanhPho = maThanhPho;
    }
    public String getTenThanhPho() { return  tenThanhPho; } 
    public void setTenTP(String tenThanhPho){ this.tenThanhPho = tenThanhPho;}
    public String getMaThanhPho() {
        return maThanhPho;
    }  
}

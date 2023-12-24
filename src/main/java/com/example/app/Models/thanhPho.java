package com.example.app.Models;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class thanhPho {

    @Id
    private String maThanhPho;

    private String tenThanhPho;

    @OneToMany(mappedBy = "thanhPho", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<nhiemKy> nhiemKys;

    public List<nhiemKy> getNhiemKys() {
        return nhiemKys;
    }

    public void setNhiemKys(List<nhiemKy> nhiemKys) {
        this.nhiemKys = nhiemKys;
    }

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

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public String getMaThanhPho() {
        return maThanhPho;
    }

    @Override
    public String toString() {
        return "thanhPho{" +
                "maThanhPho='" + maThanhPho + '\'' +
                ", tenThanhPho='" + tenThanhPho + '\'' +
                '}';
    }
}

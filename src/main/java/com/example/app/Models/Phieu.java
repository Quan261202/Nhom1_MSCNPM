package com.example.app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Phieu {
    @Id
    private String maPhieu; // Khóa chính

    @ManyToOne
    @JoinColumn(name = "maDaiBieu", foreignKey = @ForeignKey(name = "FK_Phieu_DaiBieu"))
    private daiBieu daiBieu; // Khóa ngoại đến bảng DaiBieu

    @ManyToOne
    @JoinColumn(name = "maNhiemKy", foreignKey = @ForeignKey(name = "FK_Phieu_NhiemKy"))
    private nhiemKy nhiemKy; // Khóa ngoại đến bảng NhiemKy

    @ManyToOne
    @JoinColumn(name = "maThanhPho", foreignKey = @ForeignKey(name = "FK_Phieu_ThanhPho"))
    private thanhPho thanhPho; // Khóa ngoại đến bảng ThanhPho

    // Constructor mặc định (yêu cầu bởi JPA)
    public Phieu() {
    }

    // Constructor với tham số
    public Phieu(String maPhieu, daiBieu daiBieu, nhiemKy nhiemKy, thanhPho thanhPho) {
        this.maPhieu = maPhieu;
        this.daiBieu = daiBieu;
        this.nhiemKy = nhiemKy;
        this.thanhPho = thanhPho;
    }

    // Phương thức getter và setter cho maPhieu
    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    // Phương thức getter và setter cho daiBieu
    public daiBieu getDaiBieu() {
        return daiBieu;
    }

    public void setDaiBieu(daiBieu daiBieu) {
        this.daiBieu = daiBieu;
    }

    // Phương thức getter và setter cho nhiemKy
    public nhiemKy getNhiemKy() {
        return nhiemKy;
    }

    public void setNhiemKy(nhiemKy nhiemKy) {
        this.nhiemKy = nhiemKy;
    }

    // Phương thức getter và setter cho thanhPho
    public thanhPho getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(thanhPho thanhPho) {
        this.thanhPho = thanhPho;
    }
}

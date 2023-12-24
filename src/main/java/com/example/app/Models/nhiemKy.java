package com.example.app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class nhiemKy {
    @Id
    private String maNhiemKy; // Primary key
    private String ttNhiemKy; // Column for ttNhiemKy

    // Default constructor (required by JPA)
    public nhiemKy() {
    }

    // Parameterized constructor
    public nhiemKy(String maNhiemKy, String ttNhiemKy) {
        this.maNhiemKy = maNhiemKy;
        this.ttNhiemKy = ttNhiemKy;
    }

    // Getter and setter methods for maNhiemKy
    public String getMaNhiemKy() {
        return maNhiemKy;
    }

    public void setMaNhiemKy(String maNhiemKy) {
        this.maNhiemKy = maNhiemKy;
    }

    // Getter and setter methods for ttNhiemKy
    public String getTtNhiemKy() {
        return ttNhiemKy;
    }

    public void setTtNhiemKy(String ttNhiemKy) {
        this.ttNhiemKy = ttNhiemKy;
    }
}


package com.example.app.Repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.app.Models.Phieu;
public interface PhieuRepository extends CrudRepository<Phieu, String> {
    
}
package com.example.app.Repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.app.Models.Phieu;
public interface PhieuRepo extends CrudRepository<Phieu, String> {
    
}

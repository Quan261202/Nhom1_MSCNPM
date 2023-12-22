package com.example.app.Repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Models.thanhPho;
@Repository
public interface thanhPhoRepo extends CrudRepository<thanhPho, String>{
    
}

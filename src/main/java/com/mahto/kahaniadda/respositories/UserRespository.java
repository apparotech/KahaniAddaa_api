package com.mahto.kahaniadda.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahto.kahaniadda.models.User;

public interface UserRespository  extends  JpaRepository<User, Integer>{
    void  deleteById(int id);
    User findByEmail(String email);
    
}

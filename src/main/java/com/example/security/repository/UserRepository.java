package com.example.security.repository;

import com.example.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Spring Data Jpa crud
//@Repository Spring data jpa 개념 필수.
public interface UserRepository extends JpaRepository<User,Long> {

}

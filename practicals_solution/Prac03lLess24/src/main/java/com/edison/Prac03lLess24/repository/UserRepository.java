package com.edison.Prac03lLess24.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edison.Prac03lLess24.model.User;



public interface UserRepository extends JpaRepository<User, Long>{

}

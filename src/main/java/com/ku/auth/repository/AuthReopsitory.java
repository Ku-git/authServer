package com.ku.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.auth.entity.AuthToken;

public interface AuthReopsitory extends JpaRepository<AuthToken, String>{

}

package com.example.homework9.DAO;

import com.example.homework9.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDAO extends JpaRepository<User, Integer> {
}

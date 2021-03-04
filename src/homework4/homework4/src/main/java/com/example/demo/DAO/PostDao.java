package com.example.demo.DAO;

import com.example.demo.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post, Integer> {
}

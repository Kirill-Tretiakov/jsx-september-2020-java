package com.example.demo.Controllers;

import com.example.demo.DAO.PostDao;
import com.example.demo.Models.Post;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostControl {
    private PostDao postDao;

    public PostControl(PostDao postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/savePost")
    public void savePost(@RequestParam String name) {
        Post post = new Post(name);
        postDao.save(post);
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postDao.findAll();
    }
}


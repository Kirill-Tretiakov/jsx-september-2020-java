package com.example.demo.Controllers;

import com.example.demo.DAO.UserDao;
import com.example.demo.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControl {
    private UserDao userDao;

    public UserControl(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> userList = userDao.findAll();
        return userList;
    }


    @GetMapping("/saveUser")
    public void saveUser(@RequestParam String name) {
        User user = new User(name);
        userDao.save(user);
    }


}

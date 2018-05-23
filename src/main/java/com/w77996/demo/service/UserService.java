package com.w77996.demo.service;

import com.w77996.demo.dao.UserDao;
import com.w77996.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int id){

        return userDao.getUserById(id);
    }
}

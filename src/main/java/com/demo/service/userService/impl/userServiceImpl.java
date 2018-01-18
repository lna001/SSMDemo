package com.demo.service.userService.impl;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.userService.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2018/1/18.
 */
@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(String id) {
        return userMapper.getEntityById(id);
    }
}

package com.lennie.spring_boot_mybatis.service;

import com.lennie.spring_boot_mybatis.domain.User;
import com.lennie.spring_boot_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return this.userMapper.selectUser(id);
    }
}
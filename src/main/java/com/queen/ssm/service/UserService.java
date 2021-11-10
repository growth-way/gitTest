package com.queen.ssm.service;

import com.queen.ssm.dao.UserMapper;
import com.queen.ssm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryUserByUserId(Integer userId) {
        return userMapper.queryUserByUserId(userId);
    }

}

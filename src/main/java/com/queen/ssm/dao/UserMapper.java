package com.queen.ssm.dao;

import com.queen.ssm.vo.User;

public interface UserMapper {
    User queryUserByUserId(Integer userId);
}

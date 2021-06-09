package com.catalina.infectious.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catalina.infectious.model.User;
import com.catalina.infectious.service.UserService;
import com.catalina.infectious.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User getById(String id) {
        return userMapper.getById(id);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public int deleteById(String id) {
        return userMapper.deleteById(id);
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User login(User user) {
        User target = userMapper.getByIdAndPassword(user);
        return target;
    }
}

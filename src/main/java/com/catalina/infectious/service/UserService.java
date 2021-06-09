package com.catalina.infectious.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.catalina.infectious.model.User;

/**
 *
 */
public interface UserService {
    public User getById(String id);

    public int update(User user);

    public int deleteById(String id);

    public int insert(User user);

    public User login(User user);
}

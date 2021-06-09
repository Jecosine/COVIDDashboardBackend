package com.catalina.infectious.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catalina.infectious.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.catalina.infectious.model.User
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

    int deleteById(String id);

    int insert(User user);

    User getById(String id);

    int update(User user);

    User getByIdAndPassword(User user);
}





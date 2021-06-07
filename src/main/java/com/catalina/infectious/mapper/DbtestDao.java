package com.catalina.infectious.mapper;

import com.catalina.infectious.model.Dbtest;
import org.springframework.stereotype.Repository;

@Repository
public interface DbtestDao {
    int insert(Dbtest record);

    int insertSelective(Dbtest record);
}
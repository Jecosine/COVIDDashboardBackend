package com.catalina.infectious.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catalina.infectious.model.ChinaData;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.util.List;

@Mapper
public interface ChinaMapper extends BaseMapper {
    // 按日期查询
    List<ChinaData> findByDate(Date observationDate);
    // 按序号查询
    ChinaData findByNo(Integer sNo);
}

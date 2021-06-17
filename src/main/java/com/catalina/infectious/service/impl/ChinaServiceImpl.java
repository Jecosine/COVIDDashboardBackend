package com.catalina.infectious.service.impl;

import com.catalina.infectious.mapper.ChinaMapper;
import com.catalina.infectious.model.ChinaData;
import com.catalina.infectious.service.ChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ChinaServiceImpl implements ChinaService {

    @Autowired
    private ChinaMapper chinaMapper;

    @Override
    public ChinaData findByNo(Integer sNo) {
        return chinaMapper.findByNo(sNo);
    }

    @Override
    public List<ChinaData> findByDate(Date date) {
        return chinaMapper.findByDate(date);
    }
}

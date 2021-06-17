package com.catalina.infectious.service;

import com.catalina.infectious.model.ChinaData;

import java.sql.Date;
import java.util.List;

public interface ChinaService {

    ChinaData findByNo(Integer sNo);

    List<ChinaData> findByDate(Date date);

}

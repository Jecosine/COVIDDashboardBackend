package com.catalina.infectious.controller;


import com.catalina.infectious.model.ChinaData;
import com.catalina.infectious.model.Response;
import com.catalina.infectious.service.ChinaService;
import com.catalina.infectious.service.impl.ChinaServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ResponseBody //该类属于业务类
@RequestMapping("/china")
public class ChinaController {
    @Autowired
    private ChinaService chinaService;


    /**
     * 返回的是数据类型是map
     * @param date
     * @return
     */
    @RequestMapping("/findByDate")
    public List<ChinaData> getByDate(@Param("observationDate")Date date) {
//        Date date1 = new Date(date);
        List<ChinaData> byDate = chinaService.findByDate(date);
        return byDate;
    }

}

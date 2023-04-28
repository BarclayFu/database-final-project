package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.JobHisMapper;
import com.databaseFinal.pojo.JobHis;
import com.databaseFinal.service.JobHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHisServiceImpl implements JobHisService {

    @Autowired
    private JobHisMapper jobHisMapper;

    @Override
    public List<JobHis> list() {
        return jobHisMapper.list();
    }

}

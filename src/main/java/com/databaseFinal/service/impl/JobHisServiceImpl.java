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

//    @Override
//    public void delete(Integer id) {
//        jobHisMapper.deleteById(id);
//    }
//
//    @Override
//    public void add(JobHis job) {
//
//        jobHisMapper.insert(job);
//    }
}

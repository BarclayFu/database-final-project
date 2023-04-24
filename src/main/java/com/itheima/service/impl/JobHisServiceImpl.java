package com.itheima.service.impl;

import com.itheima.mapper.JobHisMapper;
import com.itheima.pojo.JobHis;
import com.itheima.service.JobHisService;
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

package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.JobTitleMapper;
import com.databaseFinal.pojo.JobTitle;
import com.databaseFinal.service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleServiceImpl implements JobTitleService {

    @Autowired
    private JobTitleMapper jobTitleMapper;

    @Override
    public List<JobTitle> list() {
        return jobTitleMapper.list();
    }

}

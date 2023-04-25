package com.itheima.service.impl;

import com.itheima.mapper.EmpShowcaseMapper;
import com.itheima.pojo.Dept;
import com.itheima.pojo.EmpShowcase;
import com.itheima.service.EmpShowCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpShowCaseServiceImpl implements EmpShowCaseService{
    @Autowired
    private EmpShowcaseMapper empShowcaseMapper;

    @Override
    public List<EmpShowcase> list(){return empShowcaseMapper.list();}

    @Override
    public void add(EmpShowcase empShowcase) {
        empShowcaseMapper.insert(empShowcase);
    }

    @Override
    public void delete(Integer id) {
        empShowcaseMapper.deleteById(id);
    }
}

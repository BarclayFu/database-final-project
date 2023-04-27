package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.EmpShowcaseMapper;
import com.databaseFinal.pojo.EmpShowcase;
import com.databaseFinal.service.EmpShowCaseService;
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

    @Override
    public void update(EmpShowcase empShowcase){empShowcaseMapper.update(empShowcase);}
}

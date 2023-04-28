package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.VacMapper;
import com.databaseFinal.pojo.Vac;
import com.databaseFinal.service.VacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacServiceImpl implements VacService {

    @Autowired
    private VacMapper vacMapper;

    @Override
    public List<Vac> list() {
        return vacMapper.list();
    }

}

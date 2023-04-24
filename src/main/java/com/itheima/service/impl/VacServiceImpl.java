package com.itheima.service.impl;

import com.itheima.mapper.VacMapper;
import com.itheima.pojo.Vac;
import com.itheima.service.VacService;
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

    @Override
    public void delete(Integer id) {
        vacMapper.deleteById(id);
    }

    @Override
    public void add(Vac dept) {

        vacMapper.insert(dept);
    }
}

package com.itheima.service.impl;

import com.itheima.mapper.RecMapper;
import com.itheima.pojo.Rec;
import com.itheima.service.RecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecServiceImpl implements RecService {

    @Autowired
    private RecMapper recMapper;

    @Override
    public List<Rec> list() {
        return recMapper.list();
    }

    @Override
    public void delete(Integer id) {
        recMapper.deleteById(id);
    }

    @Override
    public void add(Rec rec) {

        recMapper.insert(rec);
    }
}

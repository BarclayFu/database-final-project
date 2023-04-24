package com.itheima.service.impl;

import com.itheima.mapper.TimeMapper;
import com.itheima.pojo.Time;
import com.itheima.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    private TimeMapper timeMapper;

    @Override
    public List<Time> list() {
        return timeMapper.list();
    }

    @Override
    public void delete(Integer id) {
        timeMapper.deleteById(id);
    }

    @Override
    public void add(Time time) {

        timeMapper.insert(time);
    }
}

package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.PerfMapper;
import com.databaseFinal.pojo.Perf;
import com.databaseFinal.service.PerfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfServiceImpl implements PerfService {

    @Autowired
    private PerfMapper perfMapper;

    @Override
    public List<Perf> list() {
        return perfMapper.list();
    }

    @Override
    public void delete(Integer id) {
        perfMapper.deleteById(id);
    }

//    @Override
//    public void add(Perf perf) {
//
//        perfMapper.insert(perf);
//    }
}

package com.itheima.service.impl;

import com.itheima.mapper.PayMapper;
import com.itheima.pojo.Pay;
import com.itheima.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper payMapper;

    @Override
    public List<Pay> list() {
        return payMapper.list();
    }

    @Override
    public void delete(Integer id) {
        payMapper.deleteById(id);
    }

    @Override
    public void add(Pay pay) {

        payMapper.insert(pay);
    }
}

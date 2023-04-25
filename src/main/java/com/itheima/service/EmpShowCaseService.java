package com.itheima.service;

import com.itheima.pojo.Dept;
import com.itheima.pojo.EmpShowcase;

import java.util.List;

public interface EmpShowCaseService {
    List<EmpShowcase> list();
    void add(EmpShowcase empShowcase);
    void delete(Integer id);
}

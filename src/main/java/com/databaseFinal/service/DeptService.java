package com.databaseFinal.service;

import com.databaseFinal.pojo.Dept;

import java.util.List;


public interface DeptService {

    List<Dept> list();


    void delete(Integer id);

    void add(Dept dept);

    void update(Dept dept);
}

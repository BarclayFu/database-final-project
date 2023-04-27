package com.databaseFinal.service;

import com.databaseFinal.pojo.EmpShowcase;

import java.util.List;

public interface EmpShowCaseService {
    List<EmpShowcase> list();
    void add(EmpShowcase empShowcase);
    void delete(Integer id);

    void update(EmpShowcase empShowcase);
}

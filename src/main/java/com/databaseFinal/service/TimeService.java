package com.databaseFinal.service;

import com.databaseFinal.pojo.Time;

import java.util.List;


public interface TimeService {

    List<Time> list();


    void delete(Integer id);

    void add(Time time);

    void update(Time time);
}

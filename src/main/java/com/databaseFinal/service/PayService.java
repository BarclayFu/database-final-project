package com.databaseFinal.service;

import com.databaseFinal.pojo.Pay;

import java.util.List;

public interface PayService {

    List<Pay> list();


    void delete(Integer id);

    void add(Pay pay);

    void update(Pay pay);
}

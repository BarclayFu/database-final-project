package com.databaseFinal.service;

import com.databaseFinal.pojo.Login;

import java.util.List;


public interface LoginService {

    List<Login> list();


    void delete(Integer id);


    void add(Login login);

    Login logCheck(Login login);
}

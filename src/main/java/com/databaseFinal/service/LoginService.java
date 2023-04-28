package com.databaseFinal.service;

import com.databaseFinal.pojo.Login;

import java.util.List;


public interface LoginService {

    List<Login> list();


    Login logCheck(Login login);
}

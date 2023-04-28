package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.LoginMapper;
import com.databaseFinal.pojo.Login;
import com.databaseFinal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public List<Login> list() {
        return loginMapper.list();
    }

    @Override
    public Login logCheck(Login login){
        return  loginMapper.getByUsernameAndPassword(login);
    }
}

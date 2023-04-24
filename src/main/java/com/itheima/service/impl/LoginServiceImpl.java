package com.itheima.service.impl;

import com.itheima.mapper.LoginMapper;
import com.itheima.pojo.Login;
import com.itheima.service.LoginService;
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
    public void delete(Integer id) {
        loginMapper.deleteById(id);
    }

    @Override
    public void add(Login login) {

        loginMapper.insert(login);
    }
}

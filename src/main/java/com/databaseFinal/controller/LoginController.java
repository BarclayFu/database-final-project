package com.databaseFinal.controller;

import com.databaseFinal.pojo.Login;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/login")
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;


    @GetMapping
    public Result list(){
        log.info("Get all accounts");
        List<Login> loginList =  loginService.list();
        return Result.success(loginList);
    }

    @PostMapping
    public Result login(@RequestBody Login login){
        log.info("Log in: ", login);
        Login l = loginService.logCheck(login);
        return l!=null ? Result.success(l):Result.error("Failed!");

    }

}

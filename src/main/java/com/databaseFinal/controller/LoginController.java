package com.databaseFinal.controller;

import com.databaseFinal.pojo.Login;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/login")
@RestController
public class LoginController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private LoginService loginService;

    /**
     * 查询部门数据
     * @return
     */

    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Login> loginList =  loginService.list();
        return Result.success(loginList);
    }

    @PostMapping
    public Result login(@RequestBody Login login){
        log.info("员工登陆：{}", login);
        Login l = loginService.logCheck(login);
        return l!=null ? Result.success():Result.error("失败");

    }

}

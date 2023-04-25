package com.itheima.controller;

import com.itheima.pojo.Login;
import com.itheima.pojo.Result;
import com.itheima.service.LoginService;
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
    //@RequestMapping(value = "/login",method = RequestMethod.GET) //指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Login> loginList =  loginService.list();
        return Result.success(loginList);
    }

}

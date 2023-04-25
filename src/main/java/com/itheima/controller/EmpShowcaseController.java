package com.itheima.controller;

import com.itheima.mapper.EmpShowcaseMapper;
import com.itheima.pojo.Dept;
import com.itheima.pojo.EmpShowcase;
import com.itheima.pojo.Result;
import com.itheima.service.EmpShowCaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/empshow")
@RestController
public class EmpShowcaseController {
    @Autowired
    private EmpShowCaseService empShowCaseService;

    @GetMapping
    public Result list(){
        log.info("返回员工数据");
        List<EmpShowcase> empShowList =  empShowCaseService.list();
        return Result.success(empShowList);
    }
}

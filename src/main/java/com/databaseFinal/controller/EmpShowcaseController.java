package com.databaseFinal.controller;

import com.databaseFinal.pojo.EmpShowcase;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.EmpShowCaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/empdata")
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

    @PostMapping
    public Result add(@RequestBody EmpShowcase empShowcase){
        log.info("新增部门: {}" , empShowcase);
        //调用service新增部门
        empShowCaseService.add(empShowcase);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        empShowCaseService.delete(id);
        return Result.success();
    }
}

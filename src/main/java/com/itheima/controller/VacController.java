package com.itheima.controller;

import com.itheima.pojo.Vac;
import com.itheima.pojo.Result;
import com.itheima.service.VacService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/vac")
@RestController
public class VacController {


    @Autowired
    private VacService vacService;

    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Vac> vacList =  vacService.list();
        return Result.success(vacList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        vacService.delete(id);
        return Result.success();
    }


    @PostMapping
    public Result add(@RequestBody Vac vac){
        log.info("新增部门: {}" , vac);
        //调用service新增部门
        vacService.add(vac);
        return Result.success();
    }
}

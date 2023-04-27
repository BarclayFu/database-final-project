package com.databaseFinal.controller;

import com.databaseFinal.pojo.Perf;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.PerfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/perf")
@RestController
public class PerfController {


    @Autowired
    private PerfService perfService;


    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Perf> perfList =  perfService.list();
        return Result.success(perfList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        perfService.delete(id);
        return Result.success();
    }


}

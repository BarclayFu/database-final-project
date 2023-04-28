package com.databaseFinal.controller;

import com.databaseFinal.pojo.Vac;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.VacService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/vac")
@RestController
@CrossOrigin
public class VacController {

    @Autowired
    private VacService vacService;

    @GetMapping
    public Result list(){
        log.info("Get all vacation records");
        List<Vac> vacList =  vacService.list();
        return Result.success(vacList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("Delete vacation record by id",id);
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

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
        log.info("Get all employees");
        List<EmpShowcase> empShowList =  empShowCaseService.list();
        return Result.success(empShowList);
    }

    @PostMapping
    public Result add(@RequestBody EmpShowcase empShowcase){
        log.info("Add new employee" , empShowcase);
        empShowCaseService.add(empShowcase);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("Delete employee by id",id);
        empShowCaseService.delete(id);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody EmpShowcase empShowcase){
        log.info("Update employee information", empShowcase);
        empShowCaseService.update(empShowcase);
        return Result.success();
    }
}

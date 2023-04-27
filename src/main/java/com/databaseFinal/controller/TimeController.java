package com.databaseFinal.controller;

import com.databaseFinal.pojo.Time;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.TimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/time")
@RestController
@CrossOrigin
public class TimeController {


    @Autowired
    private TimeService timeService;

    @GetMapping
    public Result list(){
        log.info("Get all timesheets");
        List<Time> timeList =  timeService.list();
        return Result.success(timeList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("Delete timesheets by id",id);
        timeService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Time time){
        log.info("Add new timesheet" , time);
        //调用service新增部门
        timeService.add(time);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Time time){
        log.info("Update timesheet", time);
        timeService.update(time);
        return Result.success();
    }
}

package com.databaseFinal.controller;

import com.databaseFinal.pojo.JobHis;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.JobHisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/jobhis")
@RestController
@CrossOrigin
public class JobHisController {

    @Autowired
    private JobHisService jobHisService;

    @GetMapping
    public Result list(){
        log.info("Get all job history");
        List<JobHis> hisList =  jobHisService.list();
        return Result.success(hisList);
    }

}

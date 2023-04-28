package com.databaseFinal.controller;

import com.databaseFinal.pojo.JobTitle;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.JobTitleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/jobtitles")
@RestController
@CrossOrigin
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping
    public Result list(){
        log.info("Get all job titles");
        List<JobTitle> jobList =  jobTitleService.list();
        return Result.success(jobList);
    }

}

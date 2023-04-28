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
@CrossOrigin
public class PerfController {


    @Autowired
    private PerfService perfService;


    @GetMapping
    public Result list(){
        log.info("Show all performance record");
        List<Perf> perfList =  perfService.list();
        return Result.success(perfList);
    }


}

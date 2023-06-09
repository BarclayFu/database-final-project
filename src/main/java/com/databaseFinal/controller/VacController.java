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

}

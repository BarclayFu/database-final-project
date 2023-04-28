package com.databaseFinal.controller;

import com.databaseFinal.pojo.Rec;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.RecService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/recs")
@RestController
@CrossOrigin
public class RecController {

    @Autowired
    private RecService recService;


    @GetMapping
    public Result list(){
        List<Rec> recList =  recService.list();
        return Result.success(recList);
    }

}

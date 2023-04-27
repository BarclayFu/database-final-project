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
        log.info("查询全部部门数据");
        List<Rec> recList =  recService.list();
        return Result.success(recList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        recService.delete(id);
        return Result.success();
    }


    @PostMapping
    public Result add(@RequestBody Rec rec){
        log.info("新增部门: {}" , rec);
        recService.add(rec);
        return Result.success();
    }
}

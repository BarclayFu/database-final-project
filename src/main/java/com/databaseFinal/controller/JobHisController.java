package com.databaseFinal.controller;

import com.databaseFinal.pojo.JobHis;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.JobHisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/jobhis")
@RestController
public class JobHisController {


    @Autowired
    private JobHisService jobHisService;

    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<JobHis> hisList =  jobHisService.list();
        return Result.success(hisList);
    }


//    /**
//     * 删除部门
//     * @return
//     */
//    @DeleteMapping("/{id}")
//    public Result delete(@PathVariable Integer id){
//        log.info("根据id删除部门:{}",id);
//        //调用service删除部门
//        jobHisService.delete(id);
//        return Result.success();
//    }
//
//
//    /**
//     * 新增部门
//     * @return
//     */
//    @PostMapping
//    public Result add(@RequestBody JobHis his){
//        log.info("新增部门: {}" , his);
//        //调用service新增部门
//        jobHisService.add(his);
//        return Result.success();
//    }
}

package com.itheima.controller;

import com.itheima.pojo.JobTitle;
import com.itheima.pojo.Result;
import com.itheima.service.JobTitleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 职位管理Controller
 */
@Slf4j
@RequestMapping("/jobtitles")
@RestController
public class JobTitleController {


    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<JobTitle> jobList =  jobTitleService.list();
        return Result.success(jobList);
    }


    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        jobTitleService.delete(id);
        return Result.success();
    }


    /**
     * 新增部门
     * @return
     */
    @PostMapping
    public Result add(@RequestBody JobTitle job){
        log.info("新增职位: {}" , job);
        //调用service新增部门
        jobTitleService.add(job);
        return Result.success();
    }
}

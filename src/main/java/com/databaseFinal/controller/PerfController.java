package com.databaseFinal.controller;

import com.databaseFinal.pojo.Perf;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.PerfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/perf")
@RestController
public class PerfController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private PerfService perfService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/depts",method = RequestMethod.GET) //指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Perf> perfList =  perfService.list();
        return Result.success(perfList);
    }


    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        perfService.delete(id);
        return Result.success();
    }


}

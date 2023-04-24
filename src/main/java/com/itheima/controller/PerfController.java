package com.itheima.controller;

import com.itheima.pojo.Perf;
import com.itheima.pojo.Result;
import com.itheima.service.PerfService;
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


//    /**
//     * 新增部门
//     * @return
//     */
//    @PostMapping
//    public Result add(@RequestBody Perf perf){
//        log.info("新增部门: {}" , perf);
//        //调用service新增部门
//        perfService.add(perf);
//        return Result.success();
//    }
}

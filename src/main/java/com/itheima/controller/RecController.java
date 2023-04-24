package com.itheima.controller;

import com.itheima.pojo.Rec;
import com.itheima.pojo.Result;
import com.itheima.service.RecService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/recs")
@RestController
public class RecController {

    //private static Logger log = LoggerFactory.getLogger(RecController.class);
    @Autowired
    private RecService recService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/recs",method = RequestMethod.GET) //指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Rec> recList =  recService.list();
        return Result.success(recList);
    }


    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        recService.delete(id);
        return Result.success();
    }


    /**
     * 新增部门
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Rec rec){
        log.info("新增部门: {}" , rec);
        //调用service新增部门
        recService.add(rec);
        return Result.success();
    }
}

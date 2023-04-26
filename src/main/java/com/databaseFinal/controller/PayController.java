package com.databaseFinal.controller;

import com.databaseFinal.pojo.Pay;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/pay")
@RestController
public class PayController {

    //private static Logger log = LoggerFactory.getLogger(PayController.class);
    @Autowired
    private PayService payService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/pay",method = RequestMethod.GET) //指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Pay> payList =  payService.list();
        return Result.success(payList);
    }


    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        payService.delete(id);
        return Result.success();
    }


    /**
     * 新增部门
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Pay dept){
        log.info("新增部门: {}" , dept);
        //调用service新增部门
        payService.add(dept);
        return Result.success();
    }
}

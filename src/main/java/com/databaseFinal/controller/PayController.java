package com.databaseFinal.controller;

import com.databaseFinal.pojo.Pay;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/pay")
@RestController
public class PayController {

    //private static Logger log = LoggerFactory.getLogger(PayController.class);
    @Autowired
    private PayService payService;

    @GetMapping
    public Result list(){
        log.info("Get all payroll records");
        //调用service查询部门数据
        List<Pay> payList =  payService.list();
        return Result.success(payList);
    }



    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("Delete payroll record by id",id);
        //调用service删除部门
        payService.delete(id);
        return Result.success();
    }



    @PostMapping
    public Result add(@RequestBody Pay pay){
        log.info("Add new payroll record" , pay);
        //调用service新增部门
        payService.add(pay);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Pay pay){
        log.info("Update payroll record", pay);
        payService.update(pay);
        return Result.success();
    }
}

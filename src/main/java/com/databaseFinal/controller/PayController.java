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
@CrossOrigin
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping
    public Result list(){
        log.info("Get all payroll records");
        List<Pay> payList =  payService.list();
        return Result.success(payList);
    }



    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("Delete payroll record by id",id);
        payService.delete(id);
        return Result.success();
    }



    @PostMapping
    public Result add(@RequestBody Pay pay){
        log.info("Add new payroll record" , pay);
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

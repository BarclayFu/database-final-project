package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


/**
 * 部门实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pay {
    private Integer payrollId; //ID

    private Integer employeeId;

    private LocalDate payDate;

    private Double grossPay;

}

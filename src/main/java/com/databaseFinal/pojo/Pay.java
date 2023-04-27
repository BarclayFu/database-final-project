package com.databaseFinal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pay {
    private Integer payrollId;

    private Integer employeeId;

    private LocalDate payDate;

    private Double grossPay;

}

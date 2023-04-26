package com.databaseFinal.pojo;

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
public class Vac {
    private Integer requestId; //ID

    private Integer employeeId;

    private LocalDate startDate;

    private LocalDate endDate;
    private String Status;
}

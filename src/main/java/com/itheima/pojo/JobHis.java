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
public class JobHis {
    private Integer departmentId; //ID

    private Integer employeeId;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean currentStatus;

    private String departmentName; //部门名称
}

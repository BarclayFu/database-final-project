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
public class Time {
    private Integer timesheetId; //ID

    private Integer employeeId;

    private LocalDate countDate;

    private Short regularHours;

    private Short overtimeHours;
}

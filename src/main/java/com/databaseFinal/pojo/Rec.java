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
public class Rec {
    private Integer employeeId; //ID

    private Integer courseId;
    private LocalDate completionDate;
}

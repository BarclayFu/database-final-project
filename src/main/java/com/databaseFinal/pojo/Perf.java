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
public class Perf {
    private Integer reviewId; //ID

    private Integer employeeId;

    private LocalDate reviewDate;

    private Integer reviewerId;

    private Integer rating;

    private String comments;
}

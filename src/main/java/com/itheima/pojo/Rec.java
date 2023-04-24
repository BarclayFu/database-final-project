package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

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

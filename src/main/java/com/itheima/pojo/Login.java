package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 部门实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    private Integer loginAccountId; //ID
    private String permission;

    private Integer employeeId;

    private String accountName;

    private String passwords;
}

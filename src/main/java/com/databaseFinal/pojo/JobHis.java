package com.databaseFinal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobHis {

    private Integer employeeId;

    private Integer jobTitleId;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean currentStatus;

}

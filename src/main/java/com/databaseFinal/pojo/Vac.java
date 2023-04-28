package com.databaseFinal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vac {
    private Integer requestId;

    private Integer employeeId;

    private LocalDate startDate;

    private LocalDate endDate;
    private String Status;
}

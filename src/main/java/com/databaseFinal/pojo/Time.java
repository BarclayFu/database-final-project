package com.databaseFinal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Time {
    private Integer timesheetId;

    private Integer employeeId;

    private LocalDate countDate;

    private Short regularHours;

    private Short overtimeHours;
}

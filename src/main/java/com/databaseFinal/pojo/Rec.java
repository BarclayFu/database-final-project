package com.databaseFinal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rec {
    private Integer employeeId; //ID

    private Integer courseId;
    private LocalDate completionDate;
}

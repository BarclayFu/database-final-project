package com.databaseFinal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Integer courseId; //ID

    private String courseName;

    private String instructorName;

    private String location;
}

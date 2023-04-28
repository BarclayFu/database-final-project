package com.databaseFinal.controller;

import com.databaseFinal.pojo.Course;
import com.databaseFinal.pojo.Result;
import com.databaseFinal.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/course")
@RestController
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping
    public Result list(){
        log.info("Get all courses");
        List<Course> deptList =  courseService.list();
        return Result.success(deptList);
    }
}

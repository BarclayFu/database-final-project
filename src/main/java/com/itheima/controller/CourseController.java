package com.itheima.controller;

import com.itheima.pojo.Course;
import com.itheima.pojo.Result;
import com.itheima.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RequestMapping("/course")
@RestController
public class CourseController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private CourseService courseService;

    /**
     * 查询部门数据
     * @return
     */
    //@RequestMapping(value = "/course",method = RequestMethod.GET) //指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Course> deptList =  courseService.list();
        return Result.success(deptList);
    }


    /**
     * 删除部门
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service删除部门
        courseService.delete(id);
        return Result.success();
    }


    /**
     * 新增部门
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Course dept){
        log.info("新增部门: {}" , dept);
        //调用service新增部门
        courseService.add(dept);
        return Result.success();
    }
}

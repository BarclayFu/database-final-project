package com.databaseFinal.service;

import com.databaseFinal.pojo.Course;

import java.util.List;

/**
 * 部门管理
 */
public interface CourseService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Course> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param course
     */
    void add(Course course);
}

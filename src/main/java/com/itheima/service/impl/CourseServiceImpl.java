package com.itheima.service.impl;

import com.itheima.mapper.CourseMapper;
import com.itheima.pojo.Course;
import com.itheima.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> list() {
        return courseMapper.list();
    }

    @Override
    public void delete(Integer id) {
        courseMapper.deleteById(id);
    }

    @Override
    public void add(Course course) {

        courseMapper.insert(course);
    }
}

package com.databaseFinal.service.impl;

import com.databaseFinal.mapper.CourseMapper;
import com.databaseFinal.pojo.Course;
import com.databaseFinal.service.CourseService;
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

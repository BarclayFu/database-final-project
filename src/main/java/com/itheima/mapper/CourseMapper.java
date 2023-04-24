package com.itheima.mapper;

import com.itheima.pojo.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface CourseMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from training_courses")
    List<Course> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from training_courses where course_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param course
     */
    @Insert("insert into Course(id, name) values(#{id},#{name})")
    void insert(Course course);
}

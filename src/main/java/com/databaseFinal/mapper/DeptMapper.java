package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface DeptMapper {

    @Select("select * from departments")
    List<Dept> list();

    @Delete("delete from departments where department_id = #{departmentId}")
    void deleteById(Integer id);

    @Insert("insert into departments(department_id, department_name) values(#{departmentId},#{departmentName})")
    void insert(Dept dept);

    @Update("Update departments set department_name = #{departmentName} WHERE department_id = #{departmentId}")
    void update(Dept dept);
}

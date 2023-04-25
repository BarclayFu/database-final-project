package com.itheima.mapper;

import com.itheima.pojo.EmpShowcase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpShowcaseMapper {
    @Select("SELECT e.employee_id,e.first_name,e.last_name,e.email, e.phone, e.hire_date, e.salary, d.department_name, j.job_title_name" +
            " FROM employees e JOIN departments d ON e.department_id = d.department_id" +
            " JOIN job_titles j on e.current_title_id = j.job_title_id ")
    List<EmpShowcase> list();

}

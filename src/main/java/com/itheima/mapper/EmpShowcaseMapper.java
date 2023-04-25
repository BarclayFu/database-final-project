package com.itheima.mapper;

import com.itheima.pojo.Dept;
import com.itheima.pojo.EmpShowcase;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpShowcaseMapper {
    @Select("SELECT e.employee_id,e.first_name,e.last_name,e.email, e.phone, e.hire_date, e.salary, d.department_name, j.job_title_name" +
            " FROM employees e JOIN departments d ON e.department_id = d.department_id" +
            " JOIN job_titles j on e.current_title_id = j.job_title_id ")
    List<EmpShowcase> list();

    @Insert("insert into employees(employee_id, first_name, last_name, email, phone, hire_date, salary, department_id, current_title_id) values(#{employeeId}, #{firstName}, #{lastName}, #{email}, #{phone}, #{hireDate}, #{salary}, #{departmentName}, #{jobTitleName})")
    void insert(EmpShowcase empShowcase);

    @Delete("delete from employees where employee_id = #{employeeId}")
    void deleteById(Integer id);
}

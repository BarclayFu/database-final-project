package com.databaseFinal.mapper;

import com.databaseFinal.pojo.JobHis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface JobHisMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from employee_job_history")
    List<JobHis> list();

//    /**
//     * 根据ID删除部门
//     * @param id
//     */
//    @Delete("delete from employee_job_history where employee_id = #{id}")
//    void deleteById(Integer id);
//
//    /**
//     * 新增部门
//     * @param his
//     */
//    @Insert("insert into dept(id, name) values(#{id},#{name})")
//    void insert(JobHis his);
}

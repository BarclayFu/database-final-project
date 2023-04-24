package com.itheima.mapper;

import com.itheima.pojo.JobTitle;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface JobTitleMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("SELECT * FROM job_titles")
    List<JobTitle> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from job_titles where job_title_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param job
     */
    @Insert("insert into job_titles(id, name) values(#{id},#{name})")
    void insert(JobTitle job);
}

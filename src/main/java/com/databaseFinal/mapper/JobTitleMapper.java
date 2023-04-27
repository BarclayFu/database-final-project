package com.databaseFinal.mapper;

import com.databaseFinal.pojo.JobTitle;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface JobTitleMapper {

    @Select("SELECT * FROM job_titles")
    List<JobTitle> list();

    @Delete("delete from job_titles where job_title_id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into job_titles(id, name) values(#{id},#{name})")
    void insert(JobTitle job);
}

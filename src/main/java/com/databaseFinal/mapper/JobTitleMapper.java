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

}

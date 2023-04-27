package com.databaseFinal.mapper;

import com.databaseFinal.pojo.JobHis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface JobHisMapper {

    @Select("select * from employee_job_history")
    List<JobHis> list();

}

package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Rec;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface RecMapper {

    @Select("select * from employee_training")
    List<Rec> list();


}

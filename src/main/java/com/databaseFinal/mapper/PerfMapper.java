package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Perf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface PerfMapper {

    @Select("select * from performance_reviews")
    List<Perf> list();


    @Delete("delete from performance_reviews where review_id = #{id}")
    void deleteById(Integer id);

}

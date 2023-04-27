package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Vac;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface VacMapper {

    @Select("select * from vacation_requests")
    List<Vac> list();

    @Delete("delete from vacation_requests where request_id = #{id}")
    void deleteById(Integer id);


    @Insert("insert into vac(id, name) values(#{id},#{name})")
    void insert(Vac vac);
}

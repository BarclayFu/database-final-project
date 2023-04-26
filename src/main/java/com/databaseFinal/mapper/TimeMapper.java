package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Time;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface TimeMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from timesheets")
    List<Time> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from timesheets where timesheet_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param time
     */
    @Insert("insert into time(id, name) values(#{id},#{name})")
    void insert(Time time);
}

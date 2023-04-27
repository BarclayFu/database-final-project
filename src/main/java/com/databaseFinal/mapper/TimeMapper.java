package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Time;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface TimeMapper {

    @Select("select * from timesheets")
    List<Time> list();


    @Delete("delete from timesheets where timesheet_id = #{timesheetId}")
    void deleteById(Integer id);


    @Insert("insert into timesheets (timesheet_id, employee_id, count_date, regular_hours, overtime_hours)"+
            " values(#{timesheetId},#{employeeId},#{countDate},#{regularHours},#{overtimeHours})")
    void insert(Time time);

    @Update("update timesheets SET employee_id = #{employeeId}, count_date = #{countDate}, regular_hours = #{regularHours}, overtime_hours = #{overtimeHours} WHERE timesheet_id = #{timesheetId}")
    void update(Time time);


}
